package com.eclectics.animalfarm.Animals.Goats;

public class Goat {
    private long Id;
    private String Gender;
    private String Breed;
    private int quantity;

//    constructor class

    public Goat(long id, String gender, String breed, int quantity) {
        Id = id;
        Gender = gender;
        Breed = breed;
        this.quantity = quantity;
    }

}
