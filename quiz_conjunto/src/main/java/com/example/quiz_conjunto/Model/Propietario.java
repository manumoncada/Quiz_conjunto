package com.example.quiz_conjunto.Model;

import jakarta.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
public class Propietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_propietario;

    private String nombre;
    private String cedula;

    @Temporal(TemporalType.DATE)
    private Date fecha_visita;

    private Time hora_entrada;

    public Propietario() {
    }

    public Propietario(int id_propietario, String nombre, String cedula, Date fecha_visita, Time hora_entrada) {
        this.id_propietario = id_propietario;
        this.nombre = nombre;
        this.cedula = cedula;
        this.fecha_visita = fecha_visita;
        this.hora_entrada = hora_entrada;
    }

    public int getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(int id_propietario) {
        this.id_propietario = id_propietario;
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

    public Date getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(Date fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    public Time getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(Time hora_entrada) {
        this.hora_entrada = hora_entrada;
    }
}

