package com.eclectics.animalfarm.Animals.Cows;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CowService {
    private List<Cow> cows= Arrays.asList(
            new Cow(1, "Freshian", "Black",10),
            new Cow(2, "New Jersey", "Grey", "12"),
            new Cow(3, "California red", "ReddishBrown", 6),
            new Cow(4, "Zebu", "Black", "21")

    );
    public List<Cow>getCows(){
        return cows;
    }

}
