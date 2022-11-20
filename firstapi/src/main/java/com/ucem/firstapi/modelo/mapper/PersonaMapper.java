package com.ucem.firstapi.modelo.mapper;

import com.ucem.firstapi.modelo.Persona;
import org.springframework.jdbc.core.RowMapper;


import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonaMapper implements RowMapper<Persona> {

    @Override
    public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
        Persona persona = new Persona();
        persona.setId(rs.getInt("ID"));
        persona.setRefTipoPersona(rs.getString("REF_TIPO_PERSONA"));
        persona.setPrimerNombre(rs.getString("PRIMER_NOMBRE"));
        persona.setSegundoNombre(rs.getString("SEGUNDO_NOMBRE"));
        persona.setPrimerApellido(rs.getString("PRIMER_APELLIDO"));
        persona.setSegundoApellido(rs.getString("SEGUNDO_APELLIDO"));
        persona.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO"));
        return persona;

    }
}
