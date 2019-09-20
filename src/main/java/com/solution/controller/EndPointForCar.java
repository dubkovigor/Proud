package com.solution.controller;

import com.solution.dto.CoordinateDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car/{carId}")
public interface EndPointForCar {

    @PostMapping("/currentCoordinates")
    ResponseEntity<String> setCurrentCoordinates(@RequestParam CoordinateDto coordinateDto);
}
