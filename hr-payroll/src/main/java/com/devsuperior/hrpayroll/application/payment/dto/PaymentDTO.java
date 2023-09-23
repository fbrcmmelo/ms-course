package com.devsuperior.hrpayroll.application.payment.dto;

import java.io.Serializable;

public class PaymentDTO implements Serializable {
    
    private String name;
    private Double income;
    private Integer days;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getIncome() {
        return income;
    }
    public void setIncome(Double income) {
        this.income = income;
    }
    public Integer getDays() {
        return days;
    }
    public void setDays(Integer days) {
        this.days = days;
    }
    
}
