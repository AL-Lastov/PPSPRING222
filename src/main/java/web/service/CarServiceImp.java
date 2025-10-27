package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private CarDao carDao;
@Autowired
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getCars(int count) {
        if (count <= 0) {
            return carDao.getAllCars();
        }
        if (count >= carDao.getAllCars().size()) {
            return carDao.getAllCars();
        }
        return carDao.getCarSub(count);
    }


}
