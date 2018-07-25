package com.server.demo.model;
import javax.persistence.*;

@Entity
@Table(name = "sensor_hub")
public class SensorHub {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true)
    private String mac;
    
    private String description;


    public SensorHub() {}

    public SensorHub(String mac, String description) {
        this.mac = mac;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
