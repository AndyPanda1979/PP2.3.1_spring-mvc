package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarService {

    List<Car> giveSomeCars (Integer count);
    List<Car> giveAllCars ();
}
