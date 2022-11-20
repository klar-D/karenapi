package com.ucem.firstapi.repo.dao;

import com.ucem.firstapi.modelo.Persona;

import java.util.List;

public interface PersonaDao {
    List<Persona> obtenerTodo();

    Persona obtenerPorId(int id);

    void guardar(Persona persona);

    int update(Persona persona, int id);

    int deletePorId(int id);

}
