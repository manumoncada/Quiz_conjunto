package com.example.quiz_conjunto.Controller;

import com.example.quiz_conjunto.Model.Reserva_parqueadero;
import com.example.quiz_conjunto.Service.Reserva_parqueaderoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class Reserva_parqueaderoController {

    @Autowired
    private Reserva_parqueaderoService reservaService;

    @PostMapping
    public Reserva_parqueadero crear(@RequestBody Reserva_parqueadero reserva) {
        return reservaService.crearReserva(reserva);
    }

    @GetMapping
    public List<Reserva_parqueadero> listar() {
        return reservaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Reserva_parqueadero obtener(@PathVariable int id) {
        return reservaService.obtenerPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        reservaService.eliminarReserva(id);
    }
}
