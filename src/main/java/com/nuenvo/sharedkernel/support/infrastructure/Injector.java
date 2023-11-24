package com.nuenvo.sharedkernel.support.infrastructure;

import com.nuenvo.sharedkernel.support.application.EventBus;
import com.nuenvo.sharedkernel.support.domain.BaseAggregateRoot;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@SuppressWarnings(value = "unused")
public abstract class Injector<T extends BaseAggregateRoot> {

  private final EventBus bus;

  public T inject(T root) {

    root.setBus(bus);
    return root;
  }
}
