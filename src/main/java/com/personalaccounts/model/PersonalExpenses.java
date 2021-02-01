package com.personalaccounts.model;

import lombok.Builder;
import lombok.NoArgsConstructor;


@Builder
@NoArgsConstructor
public class PersonalExpenses extends AccountFlow {


    @Override
    void deposit(AccountFlow accountFlow) {

    }
}
