package com.solution.dto;

public class CoordinateDto {

    private Double latitude;
    private Double longitude;

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
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
