package web.service;

import web.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

    List<Car> getListCars(Optional<Integer> count);

    int getCarCount();

    void createFiveCars();
}
