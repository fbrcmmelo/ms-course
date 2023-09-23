package com.devsuperior.hrpayroll.clients.worker;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Worker implements Serializable {

    private Integer id;
    private String nome;
    private Double dailyIncome;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getDailyIncome() {
        return dailyIncome;
    }
    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }
    
}
