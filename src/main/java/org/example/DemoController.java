package org.example;

import java.math.BigDecimal;
import java.util.Arrays;


public class DemoController {



    public static void main(String[] args) {

       Car[] cars = new Car[]{
               new Car(1,"ceed", new Brand[]{new Brand(22,"KIA ceed")},
                       2022, BigDecimal.valueOf(2.225),CarColor.BLACK)};


       CarService carService = new CarService();

        System.out.println(Arrays.toString(carService.showCarsByBrand(
                new Brand(22,"KIA ceed"),cars)));

    }
}