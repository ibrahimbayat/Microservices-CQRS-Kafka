package com.techbank.cqrs.core.messages;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@Getter
public abstract class Message {
    private String id;

    public Message() {
        // Varsayılan id ataması yapabilirsiniz
        this.id = null;
    }

    public Message(String id) {
        this.id = id;
    }
}