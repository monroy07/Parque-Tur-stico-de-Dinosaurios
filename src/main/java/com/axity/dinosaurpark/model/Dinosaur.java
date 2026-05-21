package com.axity.dinosaurpark.model;

public abstract class Dinosaur {

    protected final int id;

    protected final String name;

    protected double energy;

    protected DinosaurStatus status;

    public Dinosaur(int id, String name) {

        this.id = id;
        this.name = name;
        this.energy = 100.0;
        this.status = DinosaurStatus.CALM;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getEnergy() {
        return energy;
    }

    public DinosaurStatus getStatus() {
        return status;
    }

    public void consumeEnergy(double amount) {

        energy -= amount;

        if (energy < 30) {
            status = DinosaurStatus.HUNGRY;
        }
    }

    public void feed() {

        energy = 100;
        status = DinosaurStatus.CALM;
    }

    public abstract void makeSound();

}
