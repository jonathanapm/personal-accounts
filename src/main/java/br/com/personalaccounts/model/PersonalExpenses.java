package br.com.personalaccounts.model;

import java.time.LocalDateTime;

public class PersonalExpenses extends AccountFlow {

    private LocalDateTime includeDate;

    public PersonalExpenses(String description, Double value, LocalDateTime includeDate) {
        super(description, value);
        this.includeDate = includeDate;
    }

    public LocalDateTime getIncludeDate() {
        return includeDate;
    }

    public void setIncludeDate(LocalDateTime includeDate) {
        this.includeDate = includeDate;
    }
}
