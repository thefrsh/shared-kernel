package com.nuenvo.sharedkernel.support.infrastructure;

import com.nuenvo.sharedkernel.support.domain.BaseAggregateRoot;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <i> A REPOSITORY represents all objects of a certain type as a conceptual set (usually emulated). It
 * acts like a collection, except with more elaborate querying capability. Objects of the appropriate
 * type are added and removed, and the machinery behind the REPOSITORY inserts them or deletes
 * them from the database. This definition gathers a cohesive set of responsibilities for providing
 * access to the roots of AGGREGATES from early life cycle through the end. </i>
 * <p>
 * Eric Evans, Domain Driven Design, 2003
 *
 * @param  <T> Subtype of {@link BaseAggregateRoot}
 * @since  1.0.0
 * @author <a href="mailto:michal.broniewicz@nuenvo.com">Michal Broniewicz</a>
 */
@SuppressWarnings(value = "unused")
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class BaseRepository<T extends BaseAggregateRoot> {

  protected final Class<T> type;

  @PersistenceContext
  protected EntityManager manager;

  protected JpaRepositoryImplementation<T, Long> repository;

  @PostConstruct
  protected void init() {

    repository = new SimpleJpaRepository<>(type, manager);
  }

  /**
   * Returns an instance of an Aggregate Root defined by id param
   *
   * @param  specification Search specification of the sought-after Aggregate Root
   * @return Persisted instance of the Aggregate Root
   * @throws ResourceNotFoundException In case of the requested Aggregate Root is not found
   *
   * @see    Transactional
   * @see    Specification
   */
  @Transactional(
    propagation = Propagation.SUPPORTS
  )
  public T load(
    Specification<T> specification
  ) throws ResourceNotFoundException {

    return repository
      .findOne(specification)
      .orElseThrow(() -> new ResourceNotFoundException(
        String.format("%s has not been found", type.getSimpleName())
      ));
  }

  /**
   * Saves a transient instance of the Aggregate Root
   *
   * @param root An instance of the Aggregate Root to be persisted
   * @return Persisted entity of type T
   */
  @Transactional(
    propagation = Propagation.SUPPORTS
  )
  public T save(T root) {

    return repository.save(root);
  }

  /**
   * Removes a managed instance of the Aggregate Root
   *
   * @param root An instance of the Aggregate Root to be removed
   */
  public void remove(T root) {

    repository.delete(root);
  }
}
