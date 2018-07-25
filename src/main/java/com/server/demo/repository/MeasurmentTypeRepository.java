package com.server.demo.repository;

import com.server.demo.model.MeasurementType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurmentTypeRepository extends JpaRepository<MeasurementType, Long> {
}
