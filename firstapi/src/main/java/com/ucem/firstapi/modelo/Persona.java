package com.ucem.firstapi.modelo;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Data
@Entity
@Table(name = "PERSONA")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "REF_TIPO_PERSONA")
    private String refTipoPersona;

    @Column(name = "PRIMER_NOMBRE")
    private String primerNombre;

    @Column(name = "SEGUNDO_NOMBRE")
    private String segundoNombre;

    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;

    @Column(name = "SEGUNDO_APELLIDO")
    private String segundoApellido;

    @Column(name = "FECHA_NACIMIENTO")
    private Date fechaNacimiento;

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id.equals(persona.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
