package com.example.quiz_conjunto.Controller;

import com.example.quiz_conjunto.Model.Visitante;
import com.example.quiz_conjunto.Service.VisitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitantes")
public class VisitanteController {

    @Autowired
    private VisitanteService visitanteService;

    @PostMapping
    public Visitante crear(@RequestBody Visitante visitante) {
        return visitanteService.crearVisitante(visitante);
    }

    @GetMapping
    public List<Visitante> listar() {
        return visitanteService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Visitante obtener(@PathVariable int id) {
        return visitanteService.obtenerPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        visitanteService.eliminarVisitante(id);
    }
}
