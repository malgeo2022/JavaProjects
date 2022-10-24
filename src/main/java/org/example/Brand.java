package org.example;

import java.util.Objects;

public class Brand {

    private int id;
    private String modelName;

    public Brand() {
    }

    public Brand(int id, String modelName) {
        super();
        this.id = id;
        this.modelName = modelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand brand = (Brand) o;
        return id == brand.id && Objects.equals(modelName, brand.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modelName);
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
