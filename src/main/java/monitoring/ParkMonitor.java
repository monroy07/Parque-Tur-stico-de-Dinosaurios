package com.axity.dinosaurpark.monitoring;

import com.axity.dinosaurpark.zone.ArrivalZone;
import com.axity.dinosaurpark.zone.BathroomZone;
import com.axity.dinosaurpark.zone.CentralHub;
import com.axity.dinosaurpark.zone.ObservationZone;
import com.axity.dinosaurpark.zone.PowerPlant;

public class ParkMonitor {

    public void displayStatus(
            ArrivalZone arrivalZone,
            CentralHub centralHub,
            BathroomZone bathroomZone,
            ObservationZone observationZone,
            PowerPlant powerPlant
    ) {

        System.out.println("\n====== PARK MONITOR ======");

        System.out.println(
                "Arrival visitors: "
                        + arrivalZone.currentVisitors()
        );

        System.out.println(
                "Central visitors: "
                        + centralHub.currentVisitors()
        );

        System.out.println(
                "Bathroom visitors: "
                        + bathroomZone.currentVisitors()
        );

        System.out.println(
                "Observation visitors: "
                        + observationZone.currentVisitors()
        );

        System.out.println(
                "Energy: "
                        + powerPlant.getEnergy()
        );

        System.out.println("==========================");
    }
}