package com.axity.dinosaurpark.simulation;

import com.axity.dinosaurpark.monitoring.ParkMonitor;
import com.axity.dinosaurpark.model.CarnivoreDinosaur;
import com.axity.dinosaurpark.model.HerbivoreDinosaur;
import com.axity.dinosaurpark.model.Tourist;
import com.axity.dinosaurpark.zone.ArrivalZone;
import com.axity.dinosaurpark.zone.BathroomZone;
import com.axity.dinosaurpark.zone.CentralHub;
import com.axity.dinosaurpark.zone.ObservationZone;
import com.axity.dinosaurpark.zone.PowerPlant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulationEngine {

    private final ParkMonitor monitor;

    private final ArrivalZone arrivalZone;

    private final CentralHub centralHub;

    private final BathroomZone bathroomZone;

    private final ObservationZone observationZone;

    private final PowerPlant powerPlant;

    private final EventManager eventManager;

    private final List<Tourist> tourists;

    private final Random random;

    public SimulationEngine() {

        this.arrivalZone = new ArrivalZone(20, 25.0);

        this.centralHub = new CentralHub(
                30,
                15.0,
                0.4
        );

        this.bathroomZone = new BathroomZone(
                10,
                20.0,
                0.2
        );

        this.observationZone = new ObservationZone(
                "Raptor Zone",
                15,
                30.0
        );

        this.powerPlant = new PowerPlant(
                100,
                2,
                0.1
        );

        this.eventManager = new EventManager();

        this.tourists = new ArrayList<>();

        this.random = new Random();

        this.monitor = new ParkMonitor();

        initializeDinosaurs();

        initializeTourists();
    }
    private void initializeDinosaurs() {

        observationZone.addDinosaur(
                new CarnivoreDinosaur(1, "Rex")
        );

        observationZone.addDinosaur(
                new HerbivoreDinosaur(2, "Trice")
        );

        observationZone.addDinosaur(
                new CarnivoreDinosaur(3, "Raptor")
        );

        observationZone.addDinosaur(
                new HerbivoreDinosaur(4, "Brachio")
        );
    }

    private void initializeTourists() {

        for (int i = 1; i <= 10; i++) {

            tourists.add(
                    new Tourist(i, "Tourist-" + i)
            );
        }
    }

    public void runSimulation(int steps) {

        for (int step = 1; step <= steps; step++) {

            System.out.println(
                    "\n========= STEP "
                            + step
                            + " ========="
            );

            simulateTourists();

            centralHub.simulateStep();

            bathroomZone.simulateStep();

            observationZone.simulateStep();

            powerPlant.simulateStep();

            eventManager.simulateRandomEvent();

            monitor.displayStatus(
                    arrivalZone,
                    centralHub,
                    bathroomZone,
                    observationZone,
                    powerPlant
            );
        }
    }

    private void simulateTourists() {

        for (Tourist tourist : tourists) {

            int action = random.nextInt(3);

            switch (action) {

                case 0 -> arrivalZone.processArrival(tourist);

                case 1 -> centralHub.addTourist(tourist);

                case 2 -> observationZone.addTourist(tourist);
            }
        }
    }
}