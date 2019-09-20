package com.solution.dto;

public class CoordinateDto {

    private Long carId;
    private Double latitude;
    private Double longitude;

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Double getLatitude() {
        return latitude;
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

    @Override
    public String toString() {
        return "CoordinateDto{" +
                "carId=" + carId +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
