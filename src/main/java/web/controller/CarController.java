package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.Optional;


@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {

        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(required = false, value = "count") Optional<Integer> count, Model model) {
        carService.createFiveCars();
        model.addAttribute("cars", carService.getListCars(count));
        return "cars";
    }
}
