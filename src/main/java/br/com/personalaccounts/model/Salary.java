package br.com.personalaccounts.model;

import java.time.LocalDateTime;

public class Salary extends AccountFlow {

    private LocalDateTime deliveryDate;

    public Salary(String description, Double value, LocalDateTime deliveryDate) {
        super(description, value);
        this.deliveryDate = deliveryDate;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
