package com.example.quiz_conjunto.Service;

import com.example.quiz_conjunto.Model.Reserva_zona;
import com.example.quiz_conjunto.Repository.Reserva_zonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Reserva_zonaService {

    @Autowired
    private Reserva_zonaRepository reserva_zonaRepository;

    public Reserva_zona crearReserva(Reserva_zona reserva) {
        return reserva_zonaRepository.save(reserva);
    }

    public List<Reserva_zona> obtenerTodas() {
        return reserva_zonaRepository.findAll();
    }

    public Reserva_zona obtenerPorId(int id) {
        return reserva_zonaRepository.findById(id).orElse(null);
    }

    public void eliminarReserva(int id) {
        reserva_zonaRepository.deleteById(id);
    }
}
