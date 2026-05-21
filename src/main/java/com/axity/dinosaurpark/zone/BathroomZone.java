package com.axity.dinosaurpark.zone;

import com.axity.dinosaurpark.model.Tourist;

import java.util.Random;

public class BathroomZone extends ParkZone {

    private final double spaPrice;

    private final double spaProbability;

    private double totalRevenue;

    private final Random random;

    public BathroomZone(
            int maxCapacity,
            double spaPrice,
            double spaProbability
    ) {

        super("Bathroom Zone", maxCapacity);

        this.spaPrice = spaPrice;
        this.spaProbability = spaProbability;

        this.totalRevenue = 0.0;

        this.random = new Random();
    }

    @Override
    public void simulateStep() {

        for (Tourist tourist : tourists) {

            if (random.nextDouble() < spaProbability) {

                tourist.spend(spaPrice);

                totalRevenue += spaPrice;

                System.out.println(
                        tourist.getName()
                                + " compró servicio SPA."
                );
            }
        }

        System.out.println(
                "[BathroomZone] Visitantes: " + currentVisitors()
        );
    }

    public double getTotalRevenue() {

        return totalRevenue;
    }
}
