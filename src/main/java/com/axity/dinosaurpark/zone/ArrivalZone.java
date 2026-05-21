package com.axity.dinosaurpark.zone;

import com.axity.dinosaurpark.model.Tourist;

public class ArrivalZone extends ParkZone {

    private double totalRevenue;

    private final double ticketPrice;

    public ArrivalZone(int maxCapacity, double ticketPrice) {

        super("Arrival Zone", maxCapacity);

        this.ticketPrice = ticketPrice;

        this.totalRevenue = 0.0;
    }

    public boolean processArrival(Tourist tourist) {

        boolean added = addTourist(tourist);

        if (added) {

            tourist.spend(ticketPrice);

            totalRevenue += ticketPrice;
        }

        return added;
    }

    public double getTotalRevenue() {

        return totalRevenue;
    }

    @Override
    public void simulateStep() {

        System.out.println(
                "[ArrivalZone] Turistas actuales: " + currentVisitors()
        );
    }
}
