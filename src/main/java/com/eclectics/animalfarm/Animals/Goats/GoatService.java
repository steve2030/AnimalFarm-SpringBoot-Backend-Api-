package com.eclectics.animalfarm.Animals.Goats;

import org.springframework.stereotype.Service;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


@Service
public class GoatService {
    private List<Goat> goats= Arrays.asList(
            new Goat (1, "Female", "Freshian",2300),
            new Goat (2, "male", "Freshian",2300),
            new Goat (3, "Female", "California Grey",2300),
            new Goat (4, "male", "The Nottigham blue",2300),
            new Goat (5, "male", "Kienyeji",2300)
    );
    public List<Goat>getGoats(){
        return goats;
    }
public Goat getGoat(String Id){
        Long idAsLong= Long.valueOf(Id);
        Goat goat=goats.stream()
                .filter(t->idAsLong.equals(Long.valueOf(t.getId())))
                .findFirst()
                .orElse(null);
        return goat;
}










}
