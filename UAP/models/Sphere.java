package PRAKTIKUM.UAP.models;

import PRAKTIKUM.UAP.bases.Shape;
import PRAKTIKUM.UAP.interfaces.*;

public class Sphere extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double radius;

    public Sphere() {}

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3) * PI * Math.pow(radius, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 4 * 22/7 * radius * radius;
    }

    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    @Override
    public double calculateCost() {
        double kg = Math.ceil(gramToKilogram());
        return kg * PRICE_PER_KG;
    }

    @Override
    public void printInfo() {
        System.out.printf("Volume          : %.2f%n", getVolume());
        System.out.printf("Luas permukaan  : %.2f%n", getSurfaceArea());
        System.out.printf("Massa           : %.2f%n", getMass());
        System.out.printf("Massa dalam kg  : %.2f%n", gramToKilogram());
        System.out.printf("Biaya kirim     : Rp%.0f%n", calculateCost());
    }
}

