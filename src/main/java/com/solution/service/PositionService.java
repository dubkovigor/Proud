package com.solution.service;

import com.solution.dto.CoordinateDto;

public interface PositionService {

    void setCurrentCoordinate(String carId, CoordinateDto coordinateDto);
}
