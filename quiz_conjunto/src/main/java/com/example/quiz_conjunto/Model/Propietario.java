package com.example.quiz_conjunto.Model;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.List;

@Entity
public class Propietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_propietario;

    private String nombre;
    private String cedula;
    private Time Fecha_vista;
    private Time Hora_entrada;

    @OneToMany(mappedBy = "Propietario", cascade = CascadeType.ALL)
    private List<Reserva_parqueadero> Reserva_parqueadero;

    @OneToMany(mappedBy = "Propietario", cascade = CascadeType.ALL)
    private List<Visitante> Visitante;


}

