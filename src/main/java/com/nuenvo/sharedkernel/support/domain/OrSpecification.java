package com.nuenvo.sharedkernel.support.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrSpecification<T> implements BaseSpecification<T> {

  private final BaseSpecification<T> one;

  private final BaseSpecification<T> two;

  @Override
  public boolean isSatisfiedBy(T candidate) {

    return one.isSatisfiedBy(candidate) || two.isSatisfiedBy(candidate);
  }
}
