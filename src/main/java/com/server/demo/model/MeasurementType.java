package com.server.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "measurement_type")
public class MeasurementType {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String description;
    
    private String unit;

    public MeasurementType() {}

    public MeasurementType(String description, String unit) {
        this.description = description;
        this.unit = unit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
