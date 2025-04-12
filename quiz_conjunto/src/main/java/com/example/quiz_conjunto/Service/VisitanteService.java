package com.example.quiz_conjunto.Service;

import com.example.quiz_conjunto.Model.Visitante;
import com.example.quiz_conjunto.Repository.VisitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitanteService {

    @Autowired
    private VisitanteRepository visitanteRepository;

    public Visitante crearVisitante(Visitante visitante) {
        return visitanteRepository.save(visitante);
    }

    public List<Visitante> obtenerTodos() {
        return visitanteRepository.findAll();
    }

    public Visitante obtenerPorId(int id) {
        return visitanteRepository.findById(id).orElse(null);
    }

    public void eliminarVisitante(int id) {
        visitanteRepository.deleteById(id);
    }
}
