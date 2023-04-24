package org.lukaroncevic;

public class Vehicle {

    private String manufacturer;
    private String model;

    public void drive() {
        System.out.println(getManufacturer() + " " + getModel() + " is now driving!");
    }

    public void parking(){
        System.out.println(getManufacturer() + " " + getModel() + " is not parking!");
    }

    public Vehicle(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
