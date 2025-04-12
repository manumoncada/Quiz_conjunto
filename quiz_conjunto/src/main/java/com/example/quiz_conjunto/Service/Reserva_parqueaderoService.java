package com.example.quiz_conjunto.Service;

import com.example.quiz_conjunto.Model.Reserva_parqueadero;
import com.example.quiz_conjunto.Repository.Reserva_parqueaderoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Reserva_parqueaderoService {

    @Autowired
    private Reserva_parqueaderoRepository reserva_parqueaderoRepository;

    public Reserva_parqueadero crearReserva(Reserva_parqueadero reserva) {
        return reserva_parqueaderoRepository.save(reserva);
    }

    public List<Reserva_parqueadero> obtenerTodas() {
        return reserva_parqueaderoRepository.findAll();
    }

    public Reserva_parqueadero obtenerPorId(int id) {
        return reserva_parqueaderoRepository.findById(id).orElse(null);
    }

    public void eliminarReserva(int id) {
        reserva_parqueaderoRepository.deleteById(id);
    }
}
