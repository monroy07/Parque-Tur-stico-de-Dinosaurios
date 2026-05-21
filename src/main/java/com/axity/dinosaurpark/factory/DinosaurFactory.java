package com.axity.dinosaurpark.factory;

import com.axity.dinosaurpark.model.*;

public class DinosaurFactory {

    public static Dinosaur create(int id, String type, String name) {

        return switch (type.toLowerCase()) {

            case "carnivore" -> new CarnivoreDinosaur(id, name);

            case "herbivore" -> new HerbivoreDinosaur(id, name);

            default -> throw new IllegalArgumentException("Unknown type");
        };
    }
}
