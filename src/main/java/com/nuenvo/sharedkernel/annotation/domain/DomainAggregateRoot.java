package com.nuenvo.sharedkernel.annotation.domain;

import com.nuenvo.sharedkernel.support.domain.BaseAggregateRoot;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * To be used on an implementation of a {@link BaseAggregateRoot}
 *
 * @since  1.0.0
 * @author <a href="mailto:michal.broniewicz@nuenvo.com">Michal Broniewicz</a>
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@SuppressWarnings(value = "unused")
public @interface DomainAggregateRoot {

}
