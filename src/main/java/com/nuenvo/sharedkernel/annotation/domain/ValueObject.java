package com.nuenvo.sharedkernel.annotation.domain;

import jakarta.persistence.Embeddable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <i> An object that represents a descriptive aspect of the domain with no conceptual identity is called a
 * VALUE OBJECT. VALUE OBJECTS are instantiated to represent elements of the design that we care
 * about only for what they are, not who or which they are. </i>
 * <p>
 * Eric Evans, Domain Driven Design, 2003
 *
 * @since  1.0.0
 * @author <a href="michal.broniewicz@nuenvo.com">Michal Broniewicz</a>
 */
@Embeddable
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@SuppressWarnings(value = "unused")
public @interface ValueObject {

}
