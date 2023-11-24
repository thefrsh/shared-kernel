package com.nuenvo.sharedkernel.annotation.domain;

import com.nuenvo.sharedkernel.support.domain.BaseSpecification;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * To be used on an implementation of a {@link BaseSpecification}
 *
 * @since  1.0.0
 * @author <a href="mailto:michal.broniewicz@nuenvo.com">Michal Broniewicz</a>
 */
@Component
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@SuppressWarnings(value = "unused")
public @interface DomainSpecification {

  /**
   * Returns name of the bean
   * @return Name of the bean
   */
  @AliasFor(
    annotation = Component.class
  )
  String value() default "";
}
