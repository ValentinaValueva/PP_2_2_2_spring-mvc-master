package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Cars;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {

    @GetMapping (value = "/cars")
    public String cars(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {
        CarServiceImpl carServiceImpl = new CarServiceImpl();
        List<Cars> carsL = carServiceImpl.carList(count);
        if (count >= 5) {
            model.addAttribute("cars", carsL);
        } else {
            model.addAttribute("cars", carsL.stream().limit(count).toList());
        }
        return "cars";
    }

}
