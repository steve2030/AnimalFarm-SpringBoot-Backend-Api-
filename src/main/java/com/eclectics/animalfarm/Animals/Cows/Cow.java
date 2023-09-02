package com.eclectics.animalfarm.Animals.Cows;

public class Cow {
    private long Id;
    private String Breed;
    private String colour;
    private String age;

//    constructor

    public Cow(long id, String breed, String colour, String age) {
        Id = id;
        Breed = breed;
        this.colour = colour;
        this.age = age;
    }

//    getters and setters


    public long getId() {
        return Id;
    }

    public void setId(long id) {
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

//    to string


    @Override
    public String toString() {
        return "Cow{" +
                "Id=" + Id +
                ", Breed='" + Breed + '\'' +
                ", colour='" + colour + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
