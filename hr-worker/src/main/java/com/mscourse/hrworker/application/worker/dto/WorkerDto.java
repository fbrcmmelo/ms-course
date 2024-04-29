package com.mscourse.hrworker.application.worker.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class WorkerDto implements Serializable {

    private Integer id;
    private String name;
    private Double dailyIncome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

}
