package com.solution.controller.impl;

import com.solution.controller.EndPointForCar;
import com.solution.dto.CoordinateDto;
import org.springframework.http.ResponseEntity;

public class EndPointForCarImpl implements EndPointForCar {


    @Override
    public ResponseEntity<String> setCurrentCoordinates(CoordinateDto coordinateDto) {
        return ResponseEntity.ok("Igor pidor");
    }
}
