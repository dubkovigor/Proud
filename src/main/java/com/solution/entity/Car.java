package com.solution.entity;

import javax.persistence.Entity;
import java.util.List;
import java.util.Objects;

@Entity
public class Car {

    private Long carId;
    private List<Coordinate> coordinates;
    private String carName;

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", coordinates=" + coordinates +
                ", carName='" + carName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carId, car.carId) &&
                Objects.equals(coordinates, car.coordinates) &&
                Objects.equals(carName, car.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, coordinates, carName);
    }
}
