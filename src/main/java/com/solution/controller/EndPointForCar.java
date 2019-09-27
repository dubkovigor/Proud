package com.solution.controller;

import com.solution.dto.CoordinateDto;
import com.solution.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car/{carId}")
public class EndPointForCar {

    @Autowired
    private PositionService positionService;

    @PostMapping("/currentCoordinates")
    public ResponseEntity<String> setCurrentCoordinates(@RequestParam String carId, @RequestBody CoordinateDto coordinateDto) {

        positionService.setCurrentCoordinate(carId, coordinateDto);
        return ResponseEntity.ok("");
    }
}
