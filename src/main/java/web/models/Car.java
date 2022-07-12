package web.models;

import org.springframework.stereotype.Component;

public class Car {
    private String carModel;
    private int carPower;
    private String carProduceCountry;

    public Car() {}

    public Car (String carModel, int carPower, String carProduceCountry) {
        this.carModel = carModel;
        this.carPower = carPower;
        this.carProduceCountry = carProduceCountry;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getCarPower() {
        return carPower;
    }

    public String getCarProduceCountry() {
        return carProduceCountry;
    }
}