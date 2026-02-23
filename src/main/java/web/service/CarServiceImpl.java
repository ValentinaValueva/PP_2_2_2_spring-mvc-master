package web.service;

import web.model.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Cars> carList(Integer count) {
        List<Cars> carsList = new ArrayList<>(); {
            carsList.add(new Cars("Toyota", 2025, "black"));
            carsList.add(new Cars("Mazda", 2023, "red"));
            carsList.add(new Cars("Nissan", 2021, "white"));
            carsList.add(new Cars("BMW", 2024, "grey"));
            carsList.add(new Cars("Lada", 2016, "blue"));
        }
            return carsList;
    }
}
