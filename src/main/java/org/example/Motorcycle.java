package org.example;

public class Motorcycle extends Vehicle implements Maintenance {
    int numWheels;
    int numSeats;
    boolean hasSideCar;
    int milesSinceLastOilChange = 0;
    public Motorcycle(String make, String model, int year, String color, int mileage, int price, boolean isRunning, int numWheels, int numSeats, boolean hasSideCar) {
        super(make, model, year, color, mileage, price, isRunning);
        this.numWheels = numWheels;
        this.numSeats = numSeats;
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void repair() {
        System.out.println("This motorcycle has been repaired.");
    }

    @Override
    public void oilChange() {
        milesSinceLastOilChange = mileage;
        System.out.println("Oil changed!  Next change at " + (milesSinceLastOilChange + 20000) + " miles.");
    }

    public void printInfo() {
        System.out.println("This motorcycle has " + numSeats + " seats, and " + numWheels + " wheels.");
        System.out.println("It is due for an oil change at " + (milesSinceLastOilChange + 20000) + " miles.");
    }
}
