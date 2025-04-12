package com.example.quiz_conjunto.Service;

import com.example.quiz_conjunto.Model.Zona_social;
import com.example.quiz_conjunto.Repository.Zona_socialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Zona_socialService {

    @Autowired
    private Zona_socialRepository zona_socialRepository;

    public Zona_social crearZona(Zona_social zona) {
        return zona_socialRepository.save(zona);
    }

    public List<Zona_social> obtenerTodas() {
        return zona_socialRepository.findAll();
    }

    public Zona_social obtenerPorId(int id) {
        return zona_socialRepository.findById(id).orElse(null);
    }

    public void eliminarZona(int id) {
        zona_socialRepository.deleteById(id);
    }
}
