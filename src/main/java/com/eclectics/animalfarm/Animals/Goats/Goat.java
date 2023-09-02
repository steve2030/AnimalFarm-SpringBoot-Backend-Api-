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
//getters and setters

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
//    tom string conversion

    @Override
    public String toString() {
        return "Goat{" +
                "Id=" + Id +
                ", Gender='" + Gender + '\'' +
                ", Breed='" + Breed + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
