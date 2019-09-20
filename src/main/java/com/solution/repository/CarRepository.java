package com.solution.repository;

import com.solution.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Long, Car> {

    Car findCarByCarId(Long carId);
}