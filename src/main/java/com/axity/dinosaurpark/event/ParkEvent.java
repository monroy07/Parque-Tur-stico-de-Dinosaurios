package com.axity.dinosaurpark.event;

public abstract class ParkEvent {

    protected final String name;

    protected boolean active;

    public ParkEvent(String name) {

        this.name = name;

        this.active = true;
    }

    public String getName() {

        return name;
    }

    public boolean isActive() {

        return active;
    }

    public void resolve() {

        active = false;
    }

    public abstract void execute();

}