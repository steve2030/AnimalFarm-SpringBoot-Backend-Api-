package com.eclectics.animalfarm.workers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkerController {
    @Autowired
    private WorkerService workerService;
    @GetMapping(path="workers")
    public List<Worker>getWorkers(){
        return workerService.getWorkers();
    }
    @GetMapping(path = "/workers/{Id}")
    public Worker getWorkers(@PathVariable String Id){
        return workerService.getWorker(Id);

    }
}
