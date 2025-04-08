package com.example.quiz_conjunto.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Time;

@Entity
public class Reserva_zona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_reserva;

    private Time fecha;
    private String hora_inicio;
    private int id_zona;
    private int id_propietario;

}
