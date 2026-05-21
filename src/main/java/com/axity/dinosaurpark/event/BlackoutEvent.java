package com.axity.dinosaurpark.event;

public class BlackoutEvent extends ParkEvent {

    public BlackoutEvent() {

        super("Massive Blackout");
    }

    @Override
    public void execute() {

        System.out.println(
                "⚡ Ocurrió un apagón masivo!"
        );

        resolve();
    }
}
