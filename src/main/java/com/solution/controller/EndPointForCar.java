package com.solution.controller;

import com.solution.dto.CoordinateDto;
import com.solution.service.PositionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car/{carId}")
public class EndPointForCar {

    private final PositionService positionService;

    public EndPointForCar(PositionService positionService) {
        this.positionService = positionService;
    }

    @PostMapping("/currentCoordinates")
    public ResponseEntity<String> setCurrentCoordinates(@PathVariable(value = "carId") String carId, @RequestBody CoordinateDto coordinateDto) {

        positionService.setCurrentCoordinate(carId, coordinateDto);
        return ResponseEntity.ok("Leha");
    }
}
