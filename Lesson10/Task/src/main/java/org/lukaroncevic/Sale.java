package org.lukaroncevic;

public class Sale {

    private String salesPerson;
    private String region;
    private float amount;

    public Sale(String salesPerson, String region, float amount) {
        this.salesPerson = salesPerson;
        this.region = region;
        this.amount = amount;
    }

    public String getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
