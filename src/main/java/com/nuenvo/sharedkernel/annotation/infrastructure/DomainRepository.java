package com.nuenvo.sharedkernel.annotation.infrastructure;

import com.nuenvo.sharedkernel.support.infrastructure.BaseRepository;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Repository;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * To be used on an implementation of {@link BaseRepository}
 *
 * @since  1.0.0
 * @author <a href="mailto:michal.broniewicz@nuenvo.com">Michal Broniewicz</a>
 */
@Repository
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@SuppressWarnings(value = "unused")
public @interface DomainRepository {

  /**
   * Returns name of the bean
   * @return Name of the bean
   */
  @AliasFor(
    annotation = Repository.class
  )
  String value() default "";
}
