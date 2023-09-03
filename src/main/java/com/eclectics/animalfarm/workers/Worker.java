package com.eclectics.animalfarm.workers;

public class Worker {
    private Long Id;
    private String name;
    private String Gender;
    private String position;
//    Constructor

    public Worker(Long id, String name, String gender, String position) {
        Id = id;
        this.name = name;
        Gender = gender;
        this.position = position;
    }
//    Getters and Setters

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

//    to string

    @Override
    public String toString() {
        return "Worker{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

