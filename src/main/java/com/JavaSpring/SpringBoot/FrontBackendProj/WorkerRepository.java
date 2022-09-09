package com.JavaSpring.SpringBoot.FrontBackendProj;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {

}
