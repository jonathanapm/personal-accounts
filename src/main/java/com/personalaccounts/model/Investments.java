package com.personalaccounts.model;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Investments extends AccountFlow {

    @Getter
    @Setter
    private LocalDateTime includeDate;

    @Getter
    private Double amount;

    @Override
    void deposit(AccountFlow accountFlow) {

    }
}
