# Spring Boot Events Demo

This project demonstrates the usage of Spring Boot's event publishing and handling capabilities. 

Spring’s event-driven model promotes loose coupling, asynchronous processing, and flexibility in building modular and reactive systems. 

- `ApplicationEventPublisher`
- `@EventListener`
- `@TransactionalEventListener`
- `@Async`, `@Order`, etc.

---

## Overview

Each folder is an independent Spring Boot application, showcasing a specific feature or pattern in Spring's event mechanism.

---

### [event-basic-sync](./event-basic-sync)

Demonstrates how to create and publish a simple Spring Boot event synchronously. It uses `ApplicationEventPublisher` and listens with a basic `@EventListener`.

---

### [event-async](./event-async)

Handles Spring events asynchronously using `@Async`. Requires `@EnableAsync` configuration and demonstrates non-blocking event processing.

---

### [event-chained](./event-chained)

An event handler that publishes another event after processing. This simulates chained or cascading event flows within your application.

---

### [event-conditional](./event-conditional)

Shows how to conditionally listen to events using `@EventListener(condition = ...)`, allowing selective invocation based on event properties.

---

### [event-lifecycle](./event-lifecycle)

Demonstrates handling of Spring lifecycle events like `ContextRefreshedEvent`, `ApplicationReadyEvent`, etc.

---

### [event-ordering](./event-ordering)

Multiple event listeners can listen to the same event. This module shows how to control the execution order using `@Order`.

---

### [event-transactional](./event-transactional)

Uses `@TransactionalEventListener` to show how events can be tied to the transaction lifecycle (e.g., before commit, after commit, after rollback).

---
