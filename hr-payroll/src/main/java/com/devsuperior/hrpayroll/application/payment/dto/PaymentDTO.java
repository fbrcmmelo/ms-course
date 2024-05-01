package com.devsuperior.hrpayroll.application.payment.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PaymentDTO implements Serializable {

    private String name;
    private Double income;
    private Integer days;

    public PaymentDTO() {

    }

    public PaymentDTO(String name, Integer days) {
        this.name = name;
        this.days = days;
    }

    public Double getTotal() {
        return days * income;
    }

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
