package com.axity.dinosaurpark.repository;

public class DatabaseManager {

    public DatabaseManager() {
        System.out.println("Base de datos inicializada");
    }

    public void saveIncome(String type, double amount, int step) {
        System.out.println("[DB] Income: " + type + " $" + amount + " step " + step);
    }

    public void saveExpense(String type, double amount, int step) {
        System.out.println("[DB] Expense: " + type + " $" + amount + " step " + step);
    }

    public void saveEvent(String type, String description, int step) {
        System.out.println("[DB] Event: " + type + " - " + description + " step " + step);
    }
}
