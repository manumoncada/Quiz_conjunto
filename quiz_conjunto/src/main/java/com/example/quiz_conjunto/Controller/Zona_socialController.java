package com.example.quiz_conjunto.Controller;

import com.example.quiz_conjunto.Model.Zona_social;
import com.example.quiz_conjunto.Service.Zona_socialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zonas-sociales")
public class Zona_socialController {

    @Autowired
    private Zona_socialService zonaService;

    @PostMapping
    public Zona_social crear(@RequestBody Zona_social zona) {
        return zonaService.crearZona(zona);
    }

    @GetMapping
    public List<Zona_social> listar() {
        return zonaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Zona_social obtener(@PathVariable int id) {
        return zonaService.obtenerPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        zonaService.eliminarZona(id);
    }
}
