package com.axity.dinosaurpark.event;

public class StormEvent extends ParkEvent {

    public StormEvent() {

        super("Storm");
    }

    @Override
    public void execute() {

        System.out.println(
                "Tormenta torrencial en el parque!"
        );

        resolve();
    }
}
