package com.example.quiz_conjunto.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Zona_social {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_zona;

    private String nombre;
    private String ubicacion;
    private int capacidad;

    @OneToMany(mappedBy = "zona")
    private List<Reserva_zona> reservas;

    public Zona_social() {
    }

    public Zona_social(int id_zona, String nombre, String ubicacion, int capacidad, List<com.example.quiz_conjunto.Model.Reserva_zona> reservas) {
        this.id_zona = id_zona;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.reservas = reservas;
    }

    public int getId_zona() {
        return id_zona;
    }

    public void setId_zona(int id_zona) {
        this.id_zona = id_zona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<Reserva_zona> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva_zona> reservas) {
        this.reservas = reservas;
    }
}
