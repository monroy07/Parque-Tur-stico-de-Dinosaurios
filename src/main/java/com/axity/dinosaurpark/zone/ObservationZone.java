package com.axity.dinosaurpark.zone;

import com.axity.dinosaurpark.model.Dinosaur;
import com.axity.dinosaurpark.model.Tourist;

import java.util.ArrayList;
import java.util.List;

public class ObservationZone extends ParkZone {

    private final List<Dinosaur> dinosaurs;

    private final double entryCost;

    private double totalRevenue;

    public ObservationZone(
            String name,
            int maxCapacity,
            double entryCost
    ) {

        super(name, maxCapacity);

        this.entryCost = entryCost;

        this.totalRevenue = 0.0;

        this.dinosaurs = new ArrayList<>();
    }

    public void addDinosaur(Dinosaur dinosaur) {

        dinosaurs.add(dinosaur);
    }

    @Override
    public boolean addTourist(Tourist tourist) {

        boolean added = super.addTourist(tourist);

        if (added) {

            tourist.spend(entryCost);

            totalRevenue += entryCost;
        }

        return added;
    }

    @Override
    public void simulateStep() {

        System.out.println(
                "[" + name + "] Visitantes: "
                        + currentVisitors()
        );

        for (Dinosaur dinosaur : dinosaurs) {

            dinosaur.consumeEnergy(5);

            dinosaur.makeSound();
        }
    }

    public double getTotalRevenue() {

        return totalRevenue;
    }

    public List<Dinosaur> getDinosaurs() {

        return dinosaurs;
    }
}
