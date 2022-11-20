package com.ucem.firstapi.web;

import com.ucem.firstapi.modelo.Persona;
import com.ucem.firstapi.servicio.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaControlador {

    private PersonaServicio personaServicio;

    @Autowired
    public PersonaControlador(PersonaServicio personaServicio) {
        this.personaServicio = personaServicio;
    }

    @GetMapping("/todo")
    public List<Persona> obtenerTodo() {
        return personaServicio.obtenerTodo();
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Persona persona) {
       personaServicio.guardar(persona);
    }

    /////////////////////////////////////////////////////////////////////////////////////////

    @GetMapping("/{id}")
    public Persona obtenerPorId(@PathVariable int id) {
        return personaServicio.obtenerPorId(id);
    }

    @PutMapping("/update/{id}")
    public String update (@RequestBody Persona persona, @PathVariable int id) {
        return personaServicio.update(persona, id) + " Persona con id: " + id + ", actualizada exitosamente";
    }

    @DeleteMapping("/delete/{id}")
    public String deletePorId(@PathVariable int id) {
        return personaServicio.deletePorId(id) + " Persona con id: " + id + ", eliminada exitosamente";
    }

}
