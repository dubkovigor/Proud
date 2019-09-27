package com.solution.dto.transformers;

import com.solution.dto.CoordinateDto;
import com.solution.entity.Coordinate;

import java.util.Date;

public class CoordinateDtoToCoordinate {

    private CoordinateDtoToCoordinate() {
    }

    public static Coordinate transform(CoordinateDto coordinateDto) {

        Coordinate coordinate = new Coordinate();
        coordinate.setLatitude(coordinateDto.getLatitude());
        coordinate.setLongitude(coordinateDto.getLongitude());
        coordinate.setTimeStamp(new Date());
        return coordinate;
    }
}
