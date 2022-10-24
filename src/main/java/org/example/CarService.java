package org.example;

public class CarService {

    public Car[] showCarsByBrand(Brand brand, Car[] cars){
        if (brand == null || cars == null){
            return new Car[0];
        }

        int matchCarsAmmount = 0;
        for (Car car : cars){
            if (car.hasBrand(brand)){
                matchCarsAmmount++;
            }
        }

        Car[] filteredCars = new Car[matchCarsAmmount];
        int index = 0;
        for (Car car : cars){
            if (car.hasBrand(brand)){
                filteredCars[index++] = car;
            }
        }

        return filteredCars;
    }

}
