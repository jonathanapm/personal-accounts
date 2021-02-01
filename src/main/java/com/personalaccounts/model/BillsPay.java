package com.personalaccounts.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BillsPay extends AccountFlow {

    private LocalDateTime dueDate;

    private boolean card;

    private LocalDateTime payDay;

    @Override
    void deposit(AccountFlow accountFlow) {

    }
}
