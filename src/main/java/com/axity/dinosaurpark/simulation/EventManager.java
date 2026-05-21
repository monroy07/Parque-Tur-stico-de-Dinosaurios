package com.axity.dinosaurpark.simulation;

import com.axity.dinosaurpark.event.BlackoutEvent;
import com.axity.dinosaurpark.event.DinosaurEscapeEvent;
import com.axity.dinosaurpark.event.ParkEvent;
import com.axity.dinosaurpark.event.StormEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EventManager {

    private final List<ParkEvent> activeEvents;

    private final Random random;

    public EventManager() {

        this.activeEvents = new ArrayList<>();

        this.random = new Random();
    }

    public void simulateRandomEvent() {

        int chance = random.nextInt(100);

        ParkEvent event = null;

        if (chance < 10) {

            event = new DinosaurEscapeEvent();

        } else if (chance < 20) {

            event = new BlackoutEvent();

        } else if (chance < 30) {

            event = new StormEvent();
        }

        if (event != null) {

            activeEvents.add(event);

            event.execute();
        }
    }

    public List<ParkEvent> getActiveEvents() {

        return activeEvents;
    }
}
