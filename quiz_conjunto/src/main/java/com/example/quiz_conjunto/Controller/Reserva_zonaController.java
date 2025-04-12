package com.example.quiz_conjunto.Controller;

import com.example.quiz_conjunto.Model.Reserva_zona;
import com.example.quiz_conjunto.Service.Reserva_zonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas-zona")
public class Reserva_zonaController {

    @Autowired
    private Reserva_zonaService reservaService;

    @PostMapping
    public Reserva_zona crear(@RequestBody Reserva_zona reserva) {
        return reservaService.crearReserva(reserva);
    }

    @GetMapping
    public List<Reserva_zona> listar() {
        return reservaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Reserva_zona obtener(@PathVariable int id) {
        return reservaService.obtenerPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        reservaService.eliminarReserva(id);
    }
}
