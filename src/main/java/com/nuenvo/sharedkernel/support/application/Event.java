package com.nuenvo.sharedkernel.support.application;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@SuppressWarnings(value = "unused")
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Event<T> {

  private final String name;

  private final T payload;
}
