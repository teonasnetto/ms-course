package com.teonas.hrworker.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teonas.hrworker.entities.Worker;
import com.teonas.hrworker.repositories.WorkerRepositorie;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
    
    private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);

    @Autowired
    private Environment env;

    @Autowired
    private WorkerRepositorie repositorie;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> list = repositorie.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        logger.info("PORT = " + env.getProperty("local.server.port"));
        Worker obj = repositorie.findById(id).get();
        return ResponseEntity.ok(obj);
    }

}
