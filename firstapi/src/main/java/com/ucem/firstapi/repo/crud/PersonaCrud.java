package com.ucem.firstapi.repo.crud;

import com.ucem.firstapi.modelo.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaCrud extends CrudRepository<Persona, Integer> {

}
