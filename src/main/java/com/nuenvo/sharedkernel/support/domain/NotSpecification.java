package com.nuenvo.sharedkernel.support.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NotSpecification<T> implements BaseSpecification<T> {

  private final BaseSpecification<T> that;

  @Override
  public boolean isSatisfiedBy(T candidate) {

    return !that.isSatisfiedBy(candidate);
  }
}
