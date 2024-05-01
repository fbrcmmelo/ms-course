package com.mscourse.hrworker.application.worker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mscourse.hrworker.application.worker.dto.WorkerDto;
import com.mscourse.hrworker.application.worker.mapper.WorkerMapper;
import com.mscourse.hrworker.domain.worker.service.WorkerService;

@RestController
@RequestMapping(value = "/workers", produces = MediaType.APPLICATION_JSON_VALUE)
public class WorkerController {

    private final WorkerService service;
    private final WorkerMapper mapper;

    @Autowired
    private Environment env;

    private static final Logger logger = LoggerFactory.getLogger(WorkerController.class);

    public WorkerController(WorkerService service, WorkerMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkerDto> getWorker(@PathVariable Integer id) {
        logger.info("Getting the employee's payment of worker of id: {}.", id);
        String instanceId = env.getProperty("eureka.instance.instance-id");
        logger.info("load balance active to instance id: {}", instanceId);
        return ResponseEntity.ok(mapper.toDTO(service.getWorker(id)));
    }
}
