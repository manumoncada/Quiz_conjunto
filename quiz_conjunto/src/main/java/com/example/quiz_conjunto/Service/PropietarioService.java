package com.example.quiz_conjunto.Service;

import com.example.quiz_conjunto.Model.Propietario;
import com.example.quiz_conjunto.Repository.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropietarioService {

    @Autowired
    private PropietarioRepository repository;

    public List<Propietario> obtenerTodos() {
        return repository.findAll();
    }

    public Propietario guardar(Propietario propietario) {
        return repository.save(propietario);
    }

    public void eliminar(int id) {
        repository.deleteById(id);
    }
}
