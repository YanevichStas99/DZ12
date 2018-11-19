package com.company;

public class Object {
    private double mass;
    private double price;
    private double massPrice;

    public Object(double mass, double price) {
        this.mass = mass;
        this.price = price;
        this.massPrice = this.price / this.mass;
    }

    @Override
    public String toString() {
        return "Object{" +
                "mass=" + mass +
                ", price=" + price +
                ", massPrice=" + massPrice +
                '}';
    }

    public double getMass() {
        return mass;
    }

    public double getPrice() {
        return price;
    }

    public double getMassPrice() {
        return massPrice;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMassPrice(double massPrice) {
        this.massPrice = massPrice;
    }
}
