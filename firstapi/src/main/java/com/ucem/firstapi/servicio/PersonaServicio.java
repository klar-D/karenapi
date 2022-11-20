package com.ucem.firstapi.servicio;

import com.ucem.firstapi.modelo.Persona;
import com.ucem.firstapi.repo.crud.PersonaCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class PersonaServicio {

    private final PersonaCrud personaCrud;

    @Autowired
    public PersonaServicio(PersonaCrud personaCrud) {
        this.personaCrud = personaCrud;
    }

    public List<Persona> obtenerTodo() {
        return (List<Persona>) personaCrud.findAll();
    }

    public Persona guardar(Persona persona) {
        return personaCrud.save(persona);
    }

    public Persona obtenerPorId(int id) {
       return null;
    }

    public int update(Persona persona, int id) {
       return id;
    }

    public int deletePorId(int id){
        return id;
    }

}
