package com.nuenvo.sharedkernel.annotation.domain;

import com.nuenvo.sharedkernel.support.domain.PortType;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * To be used on an implementation of the Primary Port / Use Case
 *
 * @see Port
 * @see PortType
 *
 * @since  1.0.0
 * @author <a href="mailto:michal.broniewicz@nuenvo.com">Michal Broniewicz</a>
 */
@Service
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@SuppressWarnings(value = "unused")
public @interface DomainService {

  /**
   * Returns name of the bean
   * @return Name of the bean
   */
  @AliasFor(
    annotation = Service.class
  )
  String value() default "";
}
