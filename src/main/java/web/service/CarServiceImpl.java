package web.service;

import org.springframework.stereotype.Service;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {


    private final List<Cars> carsList;
    public CarServiceImpl() {
            carsList = new ArrayList<>();

            carsList.add(new Cars("Toyota", 2025, "black"));
            carsList.add(new Cars("Mazda", 2023, "red"));
            carsList.add(new Cars("Nissan", 2021, "white"));
            carsList.add(new Cars("BMW", 2024, "grey"));
            carsList.add(new Cars("Lada", 2016, "blue"));
        }

        @Override
        public List<Cars> getAllCars() {
        return carsList;
        }

        @Override
        public List<Cars> getCarsByCount(int count) {
           if (count >= 5) {
            return getAllCars();
        } else {
            return carsList.stream().limit(count).toList();
        }
    }
}
