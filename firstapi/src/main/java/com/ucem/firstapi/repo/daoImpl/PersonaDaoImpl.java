package com.ucem.firstapi.repo.daoImpl;

import com.ucem.firstapi.modelo.Persona;
import com.ucem.firstapi.modelo.mapper.PersonaMapper;
import com.ucem.firstapi.repo.dao.PersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonaDaoImpl implements PersonaDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonaDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Persona> obtenerTodo() {
        return jdbcTemplate.query("select * from persona"
                , new PersonaMapper());
    }


    @Override
    public Persona obtenerPorId(int id) {
        String sql= "select * " +
                " from [dbo].[PERSONA] " +
                " where id = ?";
        return jdbcTemplate.queryForObject(sql, new PersonaMapper(), id);
    }

    @Override
    public void guardar(Persona persona) {
        jdbcTemplate.update("INSERT INTO [dbo].[PERSONA] ([REF_TIPO_PERSONA], [PRIMER_NOMBRE], [SEGUNDO_NOMBRE], [PRIMER_APELLIDO], [SEGUNDO_APELLIDO], [FECHA_NACIMIENTO])" +
                " VALUES " +
                " (?,?,?,?,?,?)", persona.getRefTipoPersona(),
                persona.getPrimerNombre(),
                persona.getSegundoNombre(),
                persona.getPrimerApellido(),
                persona.getSegundoApellido(),
                persona.getFechaNacimiento());
    }

    @Override
    public int update(Persona persona, int id) {
        return jdbcTemplate.update("update [dbo].[PERSONA] set [FECHA_NACIMIENTO] = ? WHERE ID = ?", persona.getFechaNacimiento(), id);
    }

    @Override
    public int deletePorId(int id) {
        return jdbcTemplate.update("delete from [dbo].[PERSONA] where id = ?", id);
    }
}
