package com.example.quiz_conjunto.Model;

import jakarta.persistence.*;

@Entity
public class Visitante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_visitante;

    private String nombre;
    private String Cedula;
    private String telefono;
    private String correo;
    private int id_propietario;

    @ManyToOne
    @JoinColumn(name = "id")
    private com.example.quiz_conjunto.Model.Propietario Propietario;

}
