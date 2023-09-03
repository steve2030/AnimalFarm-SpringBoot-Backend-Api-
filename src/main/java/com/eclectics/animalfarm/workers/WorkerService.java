package com.eclectics.animalfarm.workers;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class WorkerService {
    private List<Worker> workers= Arrays.asList(
            new Worker((long) 1, "Steve Mighty", "Male", "Manager"),
            new Worker((long)2, "Jonathan Mutune", "Male", "Security Guard"),
            new Worker((long)3, "Winfred Muthoni", "Female", "Cleaner")
    );
    public List<Worker>getWorkers(){
        return workers;
    }
    public Worker getWorker(String Id){
        Long idAsLong=Long.valueOf(Id);
        Worker worker=workers.stream()
                .filter(t->idAsLong.equals(Long.valueOf(t.getId())))
                .findFirst()
                .orElse(null);
        return worker;
    }
}
