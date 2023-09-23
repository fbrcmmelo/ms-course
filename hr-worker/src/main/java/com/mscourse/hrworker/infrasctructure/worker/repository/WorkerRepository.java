package com.mscourse.hrworker.infrasctructure.worker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mscourse.hrworker.domain.worker.entity.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Integer> {
    
}
