package com.techbank.account.cmd.api.commands;

import com.techbank.account.common.dto.AccountType;
import com.techbank.cqrs.core.commands.BaseCommand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;

    // Parametresiz yapıcı BaseCommand'dan gelecek
}
