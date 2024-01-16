package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    @Override
    public List<Car> getListCars(Optional<Integer> count) {
        if (count.isPresent() && count.get() < 5) {
            return cars.stream().limit(count.get()).toList();
        } else {
            return cars.stream().toList();
        }
    }

    @Override
    public int getCarCount() {
        return cars.size();
    }

    @Override
    public void createFiveCars() {
        cars = new ArrayList<>();
        cars.add(new Car("Car1", 1));
        cars.add(new Car("Car2", 2));
        cars.add(new Car("Car3", 3));
        cars.add(new Car("Car4", 4));
        cars.add(new Car("Car5", 5));
    }
}
