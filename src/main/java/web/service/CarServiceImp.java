package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class CarServiceImp implements CarService {
    private List<Car> cars;

    public CarServiceImp() {
        this.cars = addCars();
    }

    private List<Car> addCars() {
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("Model", "Color", 1234));
        listCar.add(new Car("Model", "Color", 1234));
        listCar.add(new Car("Model", "Color", 1234));
        listCar.add(new Car("Model", "Color", 1234));
        listCar.add(new Car("Model", "Color", 1234));
        listCar.add(new Car("Model", "Color", 1234));
        listCar.add(new Car("Model", "Color", 1234));
        listCar.add(new Car("Model", "Color", 1234));

        return listCar;
    }

    @Override
    public List<Car> getCars(Optional<Integer> count) {
        if(count.isEmpty()){
            return new ArrayList<>(cars);
        }
        int digitCout = count.get();
        if(digitCout <=0 || digitCout >= cars.size()){
            return new ArrayList<>(cars);
        }
        return new ArrayList<>(cars.subList(0, digitCout));
    }

}
