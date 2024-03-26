package com.example.springrepo.entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.lang.NonNull;

@Entity
@Table
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String modelName;

    @Column(nullable = false)
    private Integer serialNumber;

    private Double price;

    public CarEntity(Long id, @NonNull String modelName, @NonNull Integer serialNumber, Double price) {
        this.id = id;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public CarEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NonNull
    public String getModelName() {
        return modelName;
    }

    public void setModelName(@NonNull String modelName) {
        this.modelName = modelName;
    }

    @NonNull
    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(@NonNull Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
