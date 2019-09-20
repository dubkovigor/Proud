package com.solution.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Coordinate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coordinateId")
    private Long coordinateId;
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "timeStamp")
    private Date timeStamp;
    @Column(name="carId")
    private Long carId;

    public Double getLatitude() {
        return latitude;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Long getCoordinateId() {
        return coordinateId;
    }

    public void setCoordinateId(Long coordinateId) {
        this.coordinateId = coordinateId;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "coordinateId=" + coordinateId +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", timeStamp=" + timeStamp +
                ", carId=" + carId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return Objects.equals(coordinateId, that.coordinateId) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(timeStamp, that.timeStamp) &&
                Objects.equals(carId, that.carId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinateId, latitude, longitude, timeStamp, carId);
    }
}
