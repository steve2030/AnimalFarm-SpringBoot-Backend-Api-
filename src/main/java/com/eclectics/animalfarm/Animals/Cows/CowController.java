package com.eclectics.animalfarm.Animals.Cows;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CowController {
    @Autowired
    private CowService cowService;
    @GetMapping(path = "cows")
    public List<Cow>getCows(){
        return cowService.getCows();
    }


}
