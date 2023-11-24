package com.nuenvo.sharedkernel.support.domain;

/**
 * <i> A SPECIFICATION states a constraint on the state of another object, which may or may not be present.
 * It has multiple uses, but one that conveys the most basic concept is that a SPECIFICATION
 * can test any object to see if it satisfies the specified criteria. </i>
 * <p>
 * Eric Evans, Domain Driven Design, 2003
 *
 * @param  <T> Type of the value to be checked
 * @since  1.0.0
 * @author <a href="mailto:michal.broniewicz@nuenvo.com">Michal Broniewicz</a>
 */
@SuppressWarnings(value = "unused")
public interface BaseSpecification<T> {

  boolean isSatisfiedBy(T candidate);

  default BaseSpecification<T> and(BaseSpecification<T> that) {

    return new AndSpecification<>(this, that);
  }

  default BaseSpecification<T> or(BaseSpecification<T> that) {

    return new OrSpecification<>(this, that);
  }

  default BaseSpecification<T> not() {

    return new NotSpecification<>(this);
  }
}
