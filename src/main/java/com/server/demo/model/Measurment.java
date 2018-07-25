package com.server.demo.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Measurment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double value;

    private LocalDateTime timestamp;

    @ManyToOne
    private MeasurementType type;

    @ManyToOne
    private SensorHub sensorHub;

    public Measurment() {}

    public Measurment(Double value, LocalDateTime timestamp, MeasurementType type, SensorHub sensorHub) {
        this.value = value;
        this.timestamp = timestamp;
        this.type = type;
        this.sensorHub = sensorHub;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public MeasurementType getType() {
        return type;
    }

    public void setType(MeasurementType type) {
        this.type = type;
    }

    public SensorHub getSensorHub() {
        return sensorHub;
    }

    public void setSensorHub(SensorHub sensorHub) {
        this.sensorHub = sensorHub;
    }
}
