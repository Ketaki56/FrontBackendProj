package com.JavaSpring.SpringBoot.FrontBackendProj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
public class WorkerController {

    @Autowired
    private WorkerRepository workerRepository;

    @PostMapping("saveWorker")
    public String saveWorker(@RequestBody Worker worker){
        workerRepository.save(worker);
        return "Worker saved...";
    }


}
