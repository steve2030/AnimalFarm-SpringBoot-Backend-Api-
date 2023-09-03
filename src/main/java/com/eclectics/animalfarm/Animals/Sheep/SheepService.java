package com.eclectics.animalfarm.Animals.Sheep;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SheepService {
    private List<Sheep> sheep= Arrays.asList(
            new Sheep((long)1,"Kienyeji", "Red"),
            new Sheep((long)2,"Brazaville", "Reddish brown")
//            new Sheep(3,"Australian Local", "pure white"),
//            new Sheep(4, "Carribean Flock", "black with white stripes")


    );
    public List<Sheep>getSheep(){
        return sheep;
    }


    public Sheep getSheep1(String Id){
        Long idAsLong=Long.valueOf(Id);
        Sheep sheep1=sheep.stream()
                .filter(t->idAsLong.equals(Long.valueOf(t.getId())))
                .findFirst()
                .orElse(null);

        return sheep1;
    }

}
