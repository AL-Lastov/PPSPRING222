package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImp implements CarDao {

    private List<Car> cars;

    public CarDaoImp() {
        this.cars = new ArrayList<>();
        cars.add(new Car("Model1", "Color", 1234));
        cars.add(new Car("Model2", "Color", 1234));
        cars.add(new Car("Model3", "Color", 1234));
        cars.add(new Car("Model4", "Color", 1234));
        cars.add(new Car("Model5", "Color", 1234));
        cars.add(new Car("Model6", "Color", 1234));
        cars.add(new Car("Model7", "Color", 1234));
        cars.add(new Car("Model8", "Color", 1234));
        cars.add(new Car("Model9", "Color", 1234));

    }


    @Override
    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }

    @Override
    public List<Car> getCarSub(int count) {
        return cars.subList(0, count);
    }
}
