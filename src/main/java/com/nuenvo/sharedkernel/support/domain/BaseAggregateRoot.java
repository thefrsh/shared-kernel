package com.nuenvo.sharedkernel.support.domain;

import com.nuenvo.sharedkernel.support.application.EventBus;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;
import lombok.Setter;

/**
 * <i> An AGGREGATE is a cluster of associated objects that we treat as a unit for the purpose of data changes.
 * Each AGGREGATE has a root and a boundary. The boundary defines what is inside the AGGREGATE.
 * The root is a single, specific ENTITY contained in the AGGREGATE. The root is the only member of the
 * AGGREGATE that outside objects are allowed to hold references to, although objects within the
 * boundary may hold references to each other. ENTITIES other than the root have local identity, but
 * that identity needs to be distinguishable only within the AGGREGATE, because no outside object can
 * ever see it out of the context of the root ENTITY. </i>
 * <p>
 * Eric Evans, Domain Driven Design, 2003
 *
 * @since  1.0.0
 * @author <a href="mailto:michal.broniewicz@nuenvo.com">Michal Broniewicz</a>
 */
@MappedSuperclass
@SuppressWarnings(value = "unused")
public abstract class BaseAggregateRoot extends BaseEntity {

  @Setter
  @Transient
  private EventBus bus;
}
