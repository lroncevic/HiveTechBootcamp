package org.lukaroncevic.model;

public class Car extends Vehicle{

    private int doorNumber;
    private String bodyStyle;

    public Car(String manufacturer, String model, int yearOfManufacture, String color, int vin,
               String typeOfFuel, int doorNumber, String bodyStyle) {
        super(manufacturer, model, yearOfManufacture, color, vin, typeOfFuel);
        this.doorNumber = doorNumber;
        this.bodyStyle = bodyStyle;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    @Override
    public String toString() {
        return "Car{" +
                " manufacturer='" + super.getManufacturer() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", yearOfManufacture=" + super.getYearOfManufacture() +
                ", color='" + super.getColor() + '\'' +
                ", vin=" + super.getVin() +
                ", typeOfFuel='" + super.getTypeOfFuel() + '\'' +
                ", doorNumber=" + doorNumber +
                ", bodyStyle='" + bodyStyle + '\'' +
                '}';
    }
}
