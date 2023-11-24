package com.nuenvo.sharedkernel.support.domain;

import com.nuenvo.sharedkernel.annotation.domain.Port;

/**
 * Intended to use with {@link Port}
 *
 * @since  1.0.0
 * @author <a href="mailto:michal.broniewicz@nuenvo.com">Michal Broniewicz</a>
 */
@SuppressWarnings(value = "unused")
public enum PortType {

  /**
   * <i> Input ports are the means through which we implement use cases,
   * specifying how an input port performs the operations to achieve use case goals.
   * The input port object needs to receive what Jacobson (1992) called a stimulus to perform its operations.
   * This stimulus is nothing more than an object calling another.
   * The input port object receives all the necessary data to conduct its operations
   * through the stimulus sent by an input adapter. </i>
   * <p>
   * Vieira Davi, Designing Hexagonal Architecture, 2022
   * <p>
   * You can also come across with naming:
   * <ul>
   *   <li>driving ports</li>
   *   <li>incoming ports</li>
   *   <li>input ports</li>
   *   <li>left side ports</li>
   *   <li>offering ports</li>
   * </ul>
   */
  PRIMARY,

  /**
   * <i> There are situations in which a use case needs to fetch data from external resources to achieve its goals.
   * That's the role of output ports, which are represented as interfaces describing, in a technology-agnostic way,
   * which kind of data a use case or input port would need to get from outside to perform its operations.
   * I say agnostic because output ports don't care if the data comes from a particular
   * relational database technology or a filesystem, for example. </i>
   * <p>
   * Vieira Davi, Designing Hexagonal Architecture, 2022
   * <p>
   * Also known as:
   * <ul>
   *   <li>driven ports</li>
   *   <li>outgoing ports</li>
   *   <li>output ports</li>
   *   <li>right side ports</li>
   *   <li>required ports</li>
   * </ul>
   */
  SECONDARY
}
