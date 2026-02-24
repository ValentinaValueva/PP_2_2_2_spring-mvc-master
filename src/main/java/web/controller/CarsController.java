package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Cars;
import web.service.CarService;

import java.util.List;

@Controller
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping (value = "/cars")
    public String cars(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {

        List<Cars> carsL = carService.getCarsByCount(count);
        model.addAttribute("carsL", carsL);
                return "carsL";
    }

}
