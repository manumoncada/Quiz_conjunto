package com.example.quiz_conjunto.Model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
public class Reserva_parqueadero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date fecha; //
    private String hora_inicio;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Propietario propietario;

    public Reserva_parqueadero() {
    }

    public Reserva_parqueadero(int id, Date fecha, String hora_inicio, com.example.quiz_conjunto.Model.Propietario propietario) {
        this.id = id;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.propietario = propietario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Propietario getPropietario() {
        return  propietario;
    }

    public void setPropietario(Propietario propietario) {
            propietario = propietario;
    }
}


