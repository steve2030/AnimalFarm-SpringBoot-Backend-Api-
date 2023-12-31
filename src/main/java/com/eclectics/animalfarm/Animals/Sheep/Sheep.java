package com.eclectics.animalfarm.Animals.Sheep;

public class Sheep{
    private Long Id;
    private String Breed;
    private String colour;
//    constructor

    public Sheep(Long id, String breed, String colour) {
        Id = id;
        Breed = breed;
        this.colour = colour;
    }

//getters &Setters

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

//    to string


    @Override
    public String toString() {
        return "Sheep{" +
                "Id=" + Id +
                ", Breed='" + Breed + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
