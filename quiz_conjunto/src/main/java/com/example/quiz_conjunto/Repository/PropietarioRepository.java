package com.example.quiz_conjunto.Repository;

import com.example.quiz_conjunto.Model.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropietarioRepository extends JpaRepository<Propietario, Integer> {
}
