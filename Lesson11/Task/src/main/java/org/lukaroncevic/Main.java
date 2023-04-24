package org.lukaroncevic;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Audi", "S6");
        car.drive();
        car.parking();

        System.out.println("-----------------");

        Truck truck= new Truck("Ford", "Raptor");
        truck.drive();
        truck.parking();

        System.out.println("-----------------");

        Vehicle vehicle = new Vehicle("Tesla", "Truck");
        vehicle.drive();
        vehicle.parking();
    }
}