package com.mscourse.hrworker.application.worker.mapper;

import org.springframework.stereotype.Component;

import com.mscourse.hrworker.application.worker.dto.WorkerDto;
import com.mscourse.hrworker.domain.worker.entity.Worker;

@Component
public class WorkerMapper {

    public WorkerDto toDTO(Worker entity) {
        WorkerDto dto = new WorkerDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDailyIncome(entity.getDailyIncome());
        return dto;
    }
}
