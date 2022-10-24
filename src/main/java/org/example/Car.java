package org.example;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Car {

    private int id;
    private String model;
    private Brand[] brands;
    private int launchYear;
    private BigDecimal price;
    private CarColor carColor;


    public Car() {
    }

    public Car(int id, String model, Brand[] brands, int launchYear, BigDecimal price, CarColor carColor) {
        super();
        this.id = id;
        this.model = model;
        this.brands = brands;
        this.launchYear = launchYear;
        this.price = price;
        this.carColor = carColor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Brand[] getBrands() {
        return brands;
    }

    public void setBrands(Brand[] brands) {
        this.brands = brands;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && launchYear == car.launchYear && Objects.equals(model, car.model) && Arrays.equals(brands, car.brands) && Objects.equals(price, car.price) && carColor == car.carColor;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, model, launchYear, price, carColor);
        result = 31 * result + Arrays.hashCode(brands);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", brands=" + Arrays.toString(brands) +
                ", launchYear=" + launchYear +
                ", price=" + price +
                ", carColor=" + carColor +
                '}';
    }


    public boolean hasBrand(Brand brandCriteria){
        for (Brand brand : brands) {
            if (brand.equals(brandCriteria)){
                return true;
            }
        }
        return false;
    }


}
