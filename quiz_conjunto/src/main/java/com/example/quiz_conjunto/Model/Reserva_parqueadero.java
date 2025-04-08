package com.example.quiz_conjunto.Model;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.List;

@Entity
public class Reserva_parqueadero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Time fecha;
    private String hora_inicio;
    private int id_propietario;


    @ManyToOne
    @JoinColumn(name = "id")
    private com.example.quiz_conjunto.Model.Reserva_parqueadero reserva_parqueadero;

    public Reserva_parqueadero() {
    }

    public Reserva_parqueadero(int id, Time fecha, String hora_inicio, int id_propietario, Reserva_parqueadero reserva_parqueadero) {
        this.id = id;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.id_propietario = id_propietario;
        this.reserva_parqueadero = reserva_parqueadero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getFecha() {
        return fecha;
    }

    public void setFecha(Time fecha) {
        this.fecha = fecha;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(int id_propietario) {
        this.id_propietario = id_propietario;
    }

    public Reserva_parqueadero getReserva_parqueadero() {
        return reserva_parqueadero;
    }

    public void setReserva_parqueadero(Reserva_parqueadero reserva_parqueadero) {
        this.reserva_parqueadero = reserva_parqueadero;
    }
}
