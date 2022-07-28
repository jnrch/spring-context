package com.jonathan.springdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataApplication.class, args);
        CarRepository carRepository = context.getBean(CarRepository.class);

        Car car = new Car(null, "Ford", "Focus", 2011, "Blue");
        // Guardar el coche
        carRepository.save(car);

        // Encontrar el coche por marca
        Car car1 = carRepository.findCarByBrand("Ford");
        System.out.println(car1.toString());
    }
}
