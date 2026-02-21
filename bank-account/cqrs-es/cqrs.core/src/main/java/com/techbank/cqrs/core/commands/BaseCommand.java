package com.techbank.cqrs.core.commands;

import com.techbank.cqrs.core.messages.Message;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class BaseCommand extends Message {
    public BaseCommand() {
        super();
    }

    public BaseCommand(String id) {
        super(id);
    }
}