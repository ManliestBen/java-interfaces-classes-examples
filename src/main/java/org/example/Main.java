package org.example;

public class Main {
    public static void main(String[] args) {
        Car myNSX = new Car("Acura", "NSX", 2023, "Lime Green", 18423, 86000, false, 2, 4, 2, true);
        myNSX.printInfo();
        myNSX.oilChange();
        myNSX.printInfo();
        Truck f150 = new Truck("Ford", "F-150", 2022, "Black", 58423, 56000, false, 4, 4, 5, true);
        f150.printInfo();
        f150.repair();
        f150.oilChange();
        f150.printInfo();
        Motorcycle hondaRebel = new Motorcycle("Honda", "Rebel 1100", 2022, "Blue", 3400, 9600, false, 2, 1, false);
        hondaRebel.printInfo();
        hondaRebel.oilChange();
        hondaRebel.printInfo();
    }
}
