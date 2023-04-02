package org.lukaroncevic.model;

public class Truck extends Vehicle{

    private int towingCapacity;

    public Truck(String manufacturer, String model, int yearOfManufacture, String color,
                 int vin, String typeOfFuel, int towingCapacity) {
        super(manufacturer, model, yearOfManufacture, color, vin, typeOfFuel);
        this.towingCapacity = towingCapacity;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                " manufacturer='" + super.getManufacturer() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", yearOfManufacture=" + super.getYearOfManufacture() +
                ", color='" + super.getColor() + '\'' +
                ", vin=" + super.getVin() +
                ", typeOfFuel='" + super.getTypeOfFuel() + '\'' +
                ", towingCapacity=" + towingCapacity +
                '}';
    }
}
