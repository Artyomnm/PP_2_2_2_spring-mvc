package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> listCar = Arrays.asList(
            new Car("VAZ", 2101, 64),
            new Car("GAZ", 24, 95),
            new Car("NIVA", 2121, 80),
            new Car("UAZ", 469, 92),
            new Car("KAMAZ", 6520, 320));

    @Override
    public List<Car> getListCountCar (int count) {
        return listCar.stream().limit(count).collect(Collectors.toList());
    }
}
