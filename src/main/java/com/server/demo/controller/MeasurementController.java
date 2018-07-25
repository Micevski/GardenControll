package com.server.demo.controller;

import com.server.demo.model.Measurment;
import com.server.demo.repository.MeasurementRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/measurement")
public class MeasurementController {

    private final MeasurementRepository repository;

    public MeasurementController(MeasurementRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/new")
    public Measurment storeNewMeasurement(@RequestBody Measurment measurment){
        return repository.save(measurment);
    }

    @GetMapping("/all")
    public List<Measurment> getAllMeasurements(){
        return repository.findAll();
    }



}
