package service;

import model.Car;
import org.springframework.stereotype.Service;

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
        listCar.add(new Car("Toyota Camry", "Red", 2012));
        listCar.add(new Car("BMW X5", "Black", 2017));
        listCar.add(new Car("Lada Vesta", "White", 2010));
        listCar.add(new Car("Audi A6", "Blue", 2022));
        listCar.add(new Car("Kia Rio", "Grey", 2019));
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
