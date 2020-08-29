package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.LinkedList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> listOfCars() {
        List<Car> carList = new LinkedList<>();
        carList.add(new Car(1, 234, "Honda"));
        carList.add(new Car(2, 243, "Mazda"));
        carList.add(new Car(3, 544, "BMW"));
        return carList;
    }
}
