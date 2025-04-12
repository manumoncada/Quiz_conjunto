package com.example.quiz_conjunto.Controller;

import com.example.quiz_conjunto.Model.Propietario;
import com.example.quiz_conjunto.Service.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/propietarios")
public class PropietarioController {

    @Autowired
    private PropietarioService service;

    @GetMapping
    public List<Propietario> listar() {
        return service.obtenerTodos();
    }

    @PostMapping
    public Propietario crear(@RequestBody Propietario propietario) {
        return service.guardar(propietario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}
