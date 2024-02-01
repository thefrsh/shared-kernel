package com.nuenvo.sharedkernel.support.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * <i> An object defined primarily by its identity is called an ENTITY. ENTITIES have special modeling
 * and design considerations. They have life cycles that can radically change their form and content,
 * but a thread of continuity must be maintained. Their identities must be defined so that they can be
 * effectively tracked. Their class definitions, responsibilities, attributes, and associations should
 * revolve around who they are, rather than the particular attributes they carry. Even for ENTITIES
 * that don't transform so radically or have such complicated life cycles, placing them in the semantic
 * category leads to more lucid models and more robust implementations. </i>
 * <p>
 * Eric Evans, Domain Driven Design, 2003
 *
 * @since  1.0.0
 * @author <a href="mailto:michal.broniewicz@nuenvo.com">Michal Broniewicz</a>
 */
@MappedSuperclass
@EqualsAndHashCode(of = "uuid")
@SuppressWarnings(value = "unused")
public abstract class BaseEntity {

  protected BaseEntity() {

    this.uuid = UUID.randomUUID().toString();
  }

  @Column(
    unique = true,
    updatable = false,
    nullable = false
  )
  private String uuid;

  @Column(
    nullable = false,
    updatable = false
  )
  @CreationTimestamp
  private LocalDateTime createdAt;

  @Column(
    nullable = false
  )
  @UpdateTimestamp
  private LocalDateTime updatedAt;

  @Version
  private Long version;
}
