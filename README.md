# Microservices-CQRS-Kafka
Event-driven Bank Account System built with CQRS, Event Sourcing and Apache Kafka

This project demonstrates a distributed architecture where the write and read sides are separated using the CQRS pattern. All state changes are persisted as events and published to Apache Kafka. The read model is built through event consumption and can be fully reconstructed via replay.

🔹 Key Concepts Implemented

    CQRS (Command Query Responsibility Segregation)

    Event Sourcing

    Apache Kafka (Producer / Consumer / Consumer Groups)

    Single-topic event stream strategy

    Partition-based ordering with aggregate ID as key

    Replay mechanism to rebuild read database

    Reflection-based event dispatching

    Deterministic projection rebuilding

🔹 Architecture Overview

    Command Service → Handles state-changing operations and produces events.

    Kafka → Acts as distributed event log.

    Query Service → Consumes events and builds optimized read models.

    Replay Support → Read side can be rebuilt from event history.

🔹 Technical Highlights

    Ordering guaranteed at partition level

    Consumer group-based scaling

    Read database treated as disposable

    Event-driven microservice structure
