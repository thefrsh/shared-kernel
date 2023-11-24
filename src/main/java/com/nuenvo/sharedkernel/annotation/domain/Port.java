package com.nuenvo.sharedkernel.annotation.domain;

import com.nuenvo.sharedkernel.support.domain.PortType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <i> ...the application communicates over ports to external agencies.
 * The word "port" is supposed to evoke thoughts of ports in an operating system, where any device that adheres
 * to the protocols of a port can be plugged into it; and ports on electronics gadgets,
 * where again, any device that fits the mechanical and electrical protocols can be plugged in.
 * The protocol for a port is given by the purpose of the conversation between the two devices.
 * The protocol takes the form of an application program interface (API).
 * For each external device there is an adapter that converts the API definition to the signals
 * needed by that device and vice versa. A graphical user interface or GUI is an example of an adapter
 * that maps the movements of a person to the API of the port.
 * Other adapters that fit the same port are automated test harnesses such as FIT or Fitnesse, batch drivers,
 * and any code needed for communication between applications across the enterprise or net.
 * On another side of the application, the application communicates with an external entity to get data.
 * The protocol is typically a database protocol.
 * From the application's perspective, if the database is moved from a SQL database to a flat file
 * or any other kind of database, the conversation across the API should not change.
 * Additional adapters for the same port thus include an SQL adapter, a flat file adapter,
 * and most importantly, an adapter to a "mock" database, one that sits in memory
 * and doesn't depend on the presence of the real database at all. </i>
 * <p>
 * Original source: <a href="https://tinyurl.com/hexagonal-arch">Alistair Cockburn: Hexagonal Architecture</a>
 *
 * @since  1.0.0
 * @author <a href="mailto:michal.broniewicz@nuenvo.com">Michal Broniewicz</a>
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@SuppressWarnings(value = "unused")
public @interface Port {

  /**
   * Returns the port type
   * @return The port type
   */
  PortType type();
}
