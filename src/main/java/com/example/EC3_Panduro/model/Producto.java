package com.example.EC3_Panduro.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "producto")
public class Producto {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(nullable = false)
    private String nombre;

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    @Column(nullable = false)
    private BigDecimal precio;
}