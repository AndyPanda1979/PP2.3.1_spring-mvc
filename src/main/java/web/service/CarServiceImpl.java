package web.service;


import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{

    private final List<Car> cars; {
        cars = new ArrayList<>();
        cars.add(new Car("Lancia Abarth 037", 325, "Italy"));
        cars.add(new Car("Peugeot 205 T16", 350, "France"));
        cars.add(new Car("Audi Quattro A2", 450, "Germany"));
        cars.add(new Car("Lancia Delta S4", 400, "Italy"));
        cars.add(new Car("Ford RS 200", 450, "England"));
    }



    @Override
    public List<Car> giveSomeCars(Integer count) {
        if (count > cars.size() | count < 0) {
            count = cars.size();
        }
        return cars.subList(0, count);
    }

    @Override
    public List<Car> giveAllCars() {
        return cars;
    }
}

