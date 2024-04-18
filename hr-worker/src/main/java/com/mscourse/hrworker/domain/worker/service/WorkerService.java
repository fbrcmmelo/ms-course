package com.mscourse.hrworker.domain.worker.service;

import org.springframework.stereotype.Service;

import com.mscourse.hrworker.domain.worker.entity.Worker;
import com.mscourse.hrworker.domain.worker.exception.WorkerNotFoundException;
import com.mscourse.hrworker.infrasctructure.worker.repository.WorkerRepository;

@Service
public class WorkerService {

    private final WorkerRepository repository;

    public WorkerService(WorkerRepository repository) {
        this.repository = repository;
    }

    public Worker getWorker(Integer id) {
        return repository.findById(id).orElseThrow(WorkerNotFoundException::new);
    }
}
