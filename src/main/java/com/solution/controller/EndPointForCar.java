package com.solution.controller;

import com.solution.dto.CoordinateDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class EndPointForCar {


    @PostMapping("/currentCoordinates")
    public ResponseEntity<String> setCurrentCoordinates(@RequestBody CoordinateDto coordinateDto) {
        return ResponseEntity.ok("");
    }
}
