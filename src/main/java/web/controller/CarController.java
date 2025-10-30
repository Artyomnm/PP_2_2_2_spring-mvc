package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam int count, ModelMap model) {
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("VAZ", 2101, 64));
        listCar.add(new Car("GAZ", 24, 95));
        listCar.add(new Car("NIVA", 2121, 80));
        listCar.add(new Car("UAZ", 469, 92));
        listCar.add(new Car("KAMAZ", 6520, 320));
        List<Car> listCountCar = carService.getListCountCar(listCar, count);
        model.addAttribute("listCountCar", listCountCar);
        return "cars";
    }
}
