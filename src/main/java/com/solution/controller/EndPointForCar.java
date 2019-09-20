package com.solution.controller;

import com.solution.dto.CoordinateDto;
import com.solution.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class EndPointForCar {

    @Autowired
    private PositionService positionService;

    @PostMapping("/currentCoordinates")
    public ResponseEntity<String> setCurrentCoordinates(@RequestBody CoordinateDto coordinateDto) {

        positionService.setCurrentCoordinate(coordinateDto);
        return ResponseEntity.ok("");
    }
}
