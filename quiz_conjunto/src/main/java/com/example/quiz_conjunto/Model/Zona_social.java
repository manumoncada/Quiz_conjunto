package com.example.quiz_conjunto.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Zona_social {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_zona;

    private String nombre;
    private String ubicacion;
    private int capacidad;

}
