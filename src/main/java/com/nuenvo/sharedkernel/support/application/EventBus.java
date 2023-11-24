package com.nuenvo.sharedkernel.support.application;

/**
 * Applications persist events in an event store, which is a database of events.
 * The store has an API for adding and retrieving an entity’s events.
 * The event store also behaves like a message broker.
 * It provides an API that enables services to subscribe to events.
 * When a service saves an event in the event store, it is delivered to all interested subscribers.
 *
 * @see <a href="https://microservices.io/patterns/data/event-sourcing.html">Event Sourcing</a>
 *
 * @since 1.0.0
 * @author <a href="michal.broniewicz@nuenvo.com">Michal Broniewicz</a>
 */
@SuppressWarnings(value = "unused")
public interface EventBus {

  <T> void cast(Event<T> event);
}
