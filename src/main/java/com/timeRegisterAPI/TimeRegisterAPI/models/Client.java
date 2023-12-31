package com.timeRegisterAPI.TimeRegisterAPI.models;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "cliente")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column(name = "fecha_registro")
    private LocalDate fecha_registro;

    @Column(name = "cedula")
    private int cedula;

    @Column()
    private int telefono;

    @Column(name = "dias_suscripcion")
    private int dias_suscripcion = 30;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDate fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDias_suscripcion() {
        return dias_suscripcion;
    }

    public void setDias_suscripcion(int dias_suscripcion) {
        this.dias_suscripcion = dias_suscripcion;
    }

}
