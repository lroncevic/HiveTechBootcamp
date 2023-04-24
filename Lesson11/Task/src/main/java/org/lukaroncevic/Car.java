package org.lukaroncevic;

public class Car extends Vehicle{

    public Car(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void drive() {
        System.out.println(getManufacturer() + " " + getModel() + " is now driving!");
    }

    @Override
    public void parking() {
        System.out.println(getManufacturer() + " " + getModel() + " is not parking!");
    }
}
