package service;

import model.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    List <Car> getCars(Optional<Integer> count);
}