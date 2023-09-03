package com.eclectics.animalfarm.Animals.Sheep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SheepController {
   @Autowired
   private SheepService sheepService;
   @GetMapping(path = "sheeps")
    public List<Sheep> getSheep(){
       return sheepService.getSheep();
   }

   @GetMapping(path = "/sheeps/{Id}")
   public Sheep getSheep1(@PathVariable String Id){
      return sheepService.getSheep1(Id);
   }

}
