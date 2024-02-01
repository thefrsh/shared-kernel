package com.nuenvo.sharedkernel.annotation.domain;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <i> Factor the varying part of a process into a separate "strategy" object in the model.
 * Factor apart a rule and the behavior it governs. Implement the rule or substitutable
 * process following the STRATEGY design pattern. Multiple versions of the strategy object
 * represent different ways the process can be done.
 * Whereas the conventional view of STRATEGY as a design pattern focuses on the ability to substitute
 * different algorithms, its use as a domain pattern focuses on its ability to express a concept, usually
 * a process or a policy rule </i>
 * <p>
 * Eric Evans, Domain Driven Design, 2003
 *
 * @since  1.0.0
 * @author <a href="mailto:michal.broniewicz@nuenvo.com">Michal Broniewicz</a>
 */
@Component
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@SuppressWarnings(value = "unused")
public @interface DomainPolicy {

  /**
   * Returns name of the bean
   * @return Name of the bean
   */
  @AliasFor(
    annotation = Component.class
  )
  String value() default "";
}
