package com.devsuperior.hrpayroll.domain.payment.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Payment implements Serializable {

    private String name;
    private Double income;
    private Integer days;

    public Payment() {}
    
    public Payment(String name, Double income, Integer days) {
        this.name = name;
        this.income = income;
        this.days = days;
    }

    public String getName() {
        return name;
    }
    public Double getIncome() {
        return income;
    }
    public Integer getDays() {
        return days;
    }
    public Double getTotal() {
        return days * income;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((income == null) ? 0 : income.hashCode());
        result = prime * result + ((days == null) ? 0 : days.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Payment other = (Payment) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (income == null) {
            if (other.income != null)
                return false;
        } else if (!income.equals(other.income))
            return false;
        if (days == null) {
            if (other.days != null)
                return false;
        } else if (!days.equals(other.days))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Payment [name=" + name + ", income=" + income + ", days=" + days + "]";
    }
    
}
