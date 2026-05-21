package com.axity.dinosaurpark.model;

public class HerbivoreDinosaur extends Dinosaur {

    public HerbivoreDinosaur(int id, String name) {
        super(id, name);
    }

    @Override
    public void makeSound() {

        System.out.println(name + " hace: GRRRR suave");
    }
}
