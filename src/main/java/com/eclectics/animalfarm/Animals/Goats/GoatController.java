package com.eclectics.animalfarm.Animals.Goats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.util.List;

@RestController
public class GoatController {
    @Autowired
    private GoatService goatService;
    @GetMapping(path = "goats")
    public List<Goat>getGoats(){
        return goatService.getGoats();
    }

   @GetMapping(path = "/goats/{id}")
    public Goat getGoat(@PathVariable String id){
        return goatService.getGoat(id);
    }

}
