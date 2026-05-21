package com.axity.dinosaurpark.event;

public class DinosaurEscapeEvent extends ParkEvent {

    public DinosaurEscapeEvent() {

        super("Dinosaur Escape");
    }

    @Override
    public void execute() {

        System.out.println(
                "Un dinosaurio escapó del parque"
        );

        resolve();
    }
}
