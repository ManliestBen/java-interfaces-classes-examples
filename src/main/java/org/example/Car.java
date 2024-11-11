package org.example;

public class Car extends Vehicle implements Maintenance {
    int numDoors;
    int numWheels;
    int numSeats;
    boolean isConvertible;
    int milesSinceLastOilChange = 0;
    public Car(String make, String model, int year, String color, int mileage, int price, boolean isRunning, int numDoors, int numWheels, int numSeats, boolean isConvertible) {
        super(make, model, year, color, mileage, price, isRunning);
        this.numDoors = numDoors;
        this.numWheels = numWheels;
        this.numSeats = numSeats;
        this.isConvertible = isConvertible;
    }

    @Override
    public void repair() {
        System.out.println("This car has been repaired.");
    }

    @Override
    public void oilChange() {
        milesSinceLastOilChange = mileage;
        System.out.println("Oil changed!  Next change at " + (milesSinceLastOilChange + 20000) + " miles.");
    }

    public void printInfo() {
        System.out.println("This car has " + numSeats + " seats, " + numDoors + " doors, and " + numWheels + " wheels.");
        System.out.println("It is due for an oil change at " + (milesSinceLastOilChange + 20000) + " miles.");
    }
}
