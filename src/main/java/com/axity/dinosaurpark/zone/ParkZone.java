package com.axity.dinosaurpark.zone;

import com.axity.dinosaurpark.model.Tourist;

import java.util.ArrayList;
import java.util.List;

public abstract class ParkZone {

    protected final String name;

    protected final int maxCapacity;

    protected final List<Tourist> tourists;

    public ParkZone(String name, int maxCapacity) {

        this.name = name;
        this.maxCapacity = maxCapacity;
        this.tourists = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<Tourist> getTourists() {
        return tourists;
    }

    public boolean addTourist(Tourist tourist) {

        if (tourists.size() >= maxCapacity) {
            return false;
        }

        tourists.add(tourist);

        tourist.visitZone(name);

        return true;
    }

    public void removeTourist(Tourist tourist) {

        tourists.remove(tourist);
    }

    public int currentVisitors() {

        return tourists.size();
    }

    public abstract void simulateStep();

}
