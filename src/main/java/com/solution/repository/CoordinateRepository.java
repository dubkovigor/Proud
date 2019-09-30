package com.solution.repository;

import com.solution.entity.Coordinate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordinateRepository extends CrudRepository<Coordinate, Long> {
}
