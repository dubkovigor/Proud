package com.solution.service.impl;

import com.solution.dto.CoordinateDto;
import com.solution.dto.transformers.CoordinateDtoToCoordinate;
import com.solution.entity.Car;
import com.solution.entity.Coordinate;
import com.solution.repository.CarRepository;
import com.solution.repository.CoordinateRepository;
import com.solution.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private CoordinateRepository coordinateRepository;
    @Autowired
    private CarRepository carRepository;

    @Override
    public void setCurrentCoordinate(String carId, CoordinateDto coordinateDto) {

        Coordinate coordinate = CoordinateDtoToCoordinate.transform(coordinateDto);

        Car car = carRepository.findCarByCarId(Long.valueOf(carId));

        car.addCoordinate(coordinate);
    }
}
