package com.eclectics.animalfarm.Animals.Goats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoatController {
    @Autowired
    private GoatService goatService;
    @GetMapping(path = "goats")
    public List<Goat>getGoats(){
        return goatService.getGoats();
    }

}
