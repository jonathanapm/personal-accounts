package br.com.personalaccounts.model;

import java.time.LocalDateTime;

public class BillsPay extends AccountFlow {

    private LocalDateTime dueDate;
    private boolean card;
    private LocalDateTime payDay;

    public BillsPay(String description, Double value, LocalDateTime dueDate, boolean card, LocalDateTime payDay) {
        super(description, value);
        this.dueDate = dueDate;
        this.card = card;
        this.payDay = payDay;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCard() {
        return card;
    }

    public void setCard(boolean card) {
        this.card = card;
    }

    public LocalDateTime getPayDay() {
        return payDay;
    }

    public void setPayDay(LocalDateTime payDay) {
        this.payDay = payDay;
    }
}
