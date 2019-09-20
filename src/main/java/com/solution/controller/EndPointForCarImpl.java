package com.solution.controller;

import com.solution.dto.CoordinateDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class EndPointForCarImpl {


    @PostMapping("/currentCoordinates")
    public ResponseEntity<String> setCurrentCoordinates(CoordinateDto coordinateDto) {
        return ResponseEntity.ok("EBAT' TY NAHUI EBLAN ALESHA");
    }
}
