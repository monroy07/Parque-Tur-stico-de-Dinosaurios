package com.axity.dinosaurpark.config;

import java.io.InputStream;
import java.util.Properties;

public final class ParkConfig {

    private static ParkConfig instance;

    private final Properties props;

    private ParkConfig() {

        props = new Properties();

        try (InputStream input = getClass()
                .getClassLoader()
                .getResourceAsStream("park.properties")) {

            if (input == null) {
                throw new RuntimeException("No se encontró park.properties");
            }

            props.load(input);

        } catch (Exception e) {
            throw new RuntimeException("Error cargando configuración", e);
        }
    }

    public static ParkConfig getInstance() {

        if (instance == null) {
            instance = new ParkConfig();
        }

        return instance;
    }

    public int getInt(String key, int defaultValue) {

        String value = props.getProperty(key);

        if (value == null) {
            return defaultValue;
        }

        return Integer.parseInt(value);
    }

    public double getDouble(String key, double defaultValue) {

        String value = props.getProperty(key);

        if (value == null) {
            return defaultValue;
        }

        return Double.parseDouble(value);
    }

    public String getString(String key, String defaultValue) {

        return props.getProperty(key, defaultValue);
    }

    public long getSeed() {

        return getInt("simulation.seed", 42);
    }

    public int getTotalSteps() {

        return getInt("simulation.totalSteps", 100);
    }
}