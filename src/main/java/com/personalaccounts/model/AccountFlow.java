package com.personalaccounts.model;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public abstract class AccountFlow {

    private String description;

    private Double value;

    private LocalDateTime includeDate;

    abstract void deposit(AccountFlow accountFlow);
}
