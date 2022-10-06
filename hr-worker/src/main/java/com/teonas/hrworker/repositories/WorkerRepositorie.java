package com.teonas.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teonas.hrworker.entities.Worker;

public interface WorkerRepositorie extends JpaRepository<Worker, Long> {

}
