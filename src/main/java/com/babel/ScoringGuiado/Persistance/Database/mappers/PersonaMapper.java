package com.babel.ScoringGuiado.Persistance.Database.mappers;

import com.babel.ScoringGuiado.Models.Persona;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PersonaMapper {

    @Insert("INSERT INTO PERSONA (NOMBRE, APELLIDO1, APELLIDO2, DIRECCION_DOMICILIO_ID, DIRECCION_NOTIFICACION_ID, NIF, FECHA_NACIMIENTO, NACIONALIDAD) VALUES (#{nombre}, #{apellido1}, #{apellido2}, #{direccionDomicilio.direccionId}, #{direccionNotificacion.direccionId}, #{nif}, #{fechaNacimiento, jdbcType=DATE}, #{nacionalidad})")
    @Options(useGeneratedKeys = true, keyProperty = "personaId", keyColumn="PERSONA_ID")
    void insertPersona(Persona persona);

    @Select("SELECT persona_id FROM PERSONA WHERE  PERSONA_ID=#{personaId}")
    Integer checkPersonaExists(Persona persona);
}
