package com.server.demo.repository;

import com.server.demo.model.Measurment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementRepository extends JpaRepository<Measurment, Long> {
}
