package org.example;

public abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private String color;
    public int mileage;
    private int price;
    private boolean isRunning;
    public Vehicle(String make, String model, int year, String color, int mileage, int price, boolean isRunning) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
        this.isRunning = isRunning;
    }
}
