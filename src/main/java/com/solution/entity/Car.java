package com.solution.entity;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Entity(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carId")
    private Long carId;
    @Column(name = "carName")
    private String carName;
    @Column(name = "userId")
    private Long userId;

    @OneToMany(mappedBy = "carId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Coordinate> coordinates = Collections.emptyList();

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void addCoordinate(Coordinate coordinate) {
        coordinate.setCarId(this.carId);
        this.coordinates.add(coordinate);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                ", userId=" + userId +
                ", coordinates=" + coordinates +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carId, car.carId) &&
                Objects.equals(carName, car.carName) &&
                Objects.equals(userId, car.userId) &&
                Objects.equals(coordinates, car.coordinates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, carName, userId, coordinates);
    }
}
