package com.example.quiz_conjunto.Model;

import jakarta.persistence.*;

@Entity
public class Visitante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_visitante;

    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Propietario propietario;

    public Visitante() {
    }

    public Visitante(int id_visitante, String nombre, String cedula, String telefono, String correo, Propietario propietario) {
        this.id_visitante = id_visitante;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.propietario = propietario;
    }

    public int getId_visitante() {
        return id_visitante;
    }

    public void setId_visitante(int id_visitante) {
        this.id_visitante = id_visitante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
