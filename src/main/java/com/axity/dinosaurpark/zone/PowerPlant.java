package com.axity.dinosaurpark.zone;

import java.util.Random;

public class PowerPlant {

    private double energy;

    private final double consumptionPerStep;

    private final double failureProbability;

    private boolean active;

    private final Random random;

    public PowerPlant(
            double initialEnergy,
            double consumptionPerStep,
            double failureProbability
    ) {

        this.energy = initialEnergy;
        this.consumptionPerStep = consumptionPerStep;
        this.failureProbability = failureProbability;

        this.active = true;

        this.random = new Random();
    }

    public void simulateStep() {

        if (!active) {

            System.out.println("[PowerPlant] SIN ENERGÍA");

            return;
        }

        energy -= consumptionPerStep;

        if (random.nextDouble() < failureProbability) {

            active = false;

            System.out.println(
                    "[PowerPlant] FALLA ELÉCTRICA"
            );
        }

        System.out.println(
                "[PowerPlant] Energía restante: " + energy
        );
    }

    public void repair() {

        active = true;

        System.out.println(
                "[PowerPlant] Reparación completada"
        );
    }

    public boolean isActive() {

        return active;
    }

    public double getEnergy() {

        return energy;
    }
}

