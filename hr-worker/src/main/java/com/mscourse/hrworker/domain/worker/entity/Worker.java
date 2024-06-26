package com.mscourse.hrworker.domain.worker.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mscourse.hrworker.application.worker.dto.WorkerDto;

@SuppressWarnings("serial")
@Entity
@Table(name = "TB_WORKER")
public class Worker implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Double dailyIncome;

    public Worker() {
    }

    public Worker(Integer id, String name, Double dailyIncome) {
        this.id = id;
        this.name = name;
        this.dailyIncome = dailyIncome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
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

    public WorkerDto toDto() {
        WorkerDto dto = new WorkerDto();
        dto.setId(this.id);
        dto.setName(this.name);
        dto.setDailyIncome(this.dailyIncome);
        return dto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((dailyIncome == null) ? 0 : dailyIncome.hashCode());
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
        Worker other = (Worker) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (dailyIncome == null) {
            if (other.dailyIncome != null)
                return false;
        } else if (!dailyIncome.equals(other.dailyIncome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Worker [id=" + id + ", name=" + name + ", dailyIncome=" + dailyIncome + "]";
    }

}
