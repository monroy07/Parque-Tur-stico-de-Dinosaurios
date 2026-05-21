package com.axity.dinosaurpark.zone;

import com.axity.dinosaurpark.model.Tourist;

import java.util.Random;

public class CentralHub extends ParkZone {

    private final double souvenirPrice;

    private final double purchaseProbability;

    private double totalRevenue;

    private final Random random;

    public CentralHub(
            int maxCapacity,
            double souvenirPrice,
            double purchaseProbability
    ) {

        super("Central Hub", maxCapacity);

        this.souvenirPrice = souvenirPrice;
        this.purchaseProbability = purchaseProbability;

        this.totalRevenue = 0.0;

        this.random = new Random();
    }

    @Override
    public void simulateStep() {

        for (Tourist tourist : tourists) {

            if (random.nextDouble() < purchaseProbability) {

                tourist.spend(souvenirPrice);

                totalRevenue += souvenirPrice;

                System.out.println(
                        tourist.getName()
                                + " compró un souvenir."
                );
            }
        }

        System.out.println(
                "[CentralHub] Visitantes: " + currentVisitors()
        );
    }

    public double getTotalRevenue() {

        return totalRevenue;
    }
}