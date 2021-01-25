package br.com.personalaccounts.model;

import java.time.LocalDateTime;

public final class Investments extends AccountFlow {

    private LocalDateTime includeDate;
    private Double amount;

    public Investments(String description, Double value, LocalDateTime includeDate, Double amount) {
        super(description, value);
        this.includeDate = includeDate;
        this.amount = amount;
    }

    public LocalDateTime getIncludeDate() {
        return includeDate;
    }

    public void setIncludeDate(LocalDateTime includeDate) {
        this.includeDate = includeDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
