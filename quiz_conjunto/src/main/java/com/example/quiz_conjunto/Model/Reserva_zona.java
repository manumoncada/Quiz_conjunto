package com.example.quiz_conjunto.Model;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
public class Reserva_zona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_reserva;

    private Date fecha;
    private Time hora_inicio;

    @ManyToOne
    @JoinColumn(name = "id_zona")
    private Zona_social zona;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Propietario propietario;

    public Reserva_zona() {
    }

    public Reserva_zona(int id_reserva, Date fecha, Time hora_inicio, com.example.quiz_conjunto.Model.Zona_social zona, com.example.quiz_conjunto.Model.Propietario propietario) {
        this.id_reserva = id_reserva;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.zona = zona;
        this.propietario = propietario;
    }

    public int getId_Reserva() {
        return id_reserva;
    }

    public void setId_Reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Time hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Zona_social getZona() {
        return zona;
    }

    public void setZona(Zona_social zona) {
        this.zona = zona;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}