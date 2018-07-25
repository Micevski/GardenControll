package com.server.demo.repository;

import com.server.demo.model.SensorHub;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorHubRepository extends JpaRepository<SensorHub, Long> {
}
