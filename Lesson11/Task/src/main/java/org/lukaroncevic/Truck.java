package org.lukaroncevic;

public class Truck extends Vehicle{

    public Truck(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void drive() {
        System.out.println(getManufacturer() + " " + getModel() + " is not driving!");
    }

    @Override
    public void parking() {
        System.out.println(getManufacturer() + " " + getModel() + " is parking!");
    }
}
