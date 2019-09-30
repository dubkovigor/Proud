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

import java.util.Optional;

@Service
public class PositionServiceImpl implements PositionService {


    private CoordinateRepository coordinateRepository;

    private CarRepository carRepository;

    @Autowired
    public PositionServiceImpl(CoordinateRepository coordinateRepository, CarRepository carRepository) {
        this.coordinateRepository = coordinateRepository;
        this.carRepository = carRepository;
    }

    @Override
    public void setCurrentCoordinate(String carId, CoordinateDto coordinateDto) {

        Coordinate coordinate = CoordinateDtoToCoordinate.transform(coordinateDto);

        Optional<Car> car = carRepository.findById(Long.valueOf(carId));

        car.get().addCoordinate(coordinate);
    }
}
