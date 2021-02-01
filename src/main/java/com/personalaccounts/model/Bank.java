package com.personalaccounts.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
public class Bank {

    @Getter
    private String name;

    @Getter
    private Integer value;
}
