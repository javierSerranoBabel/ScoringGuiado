package com.babel.ScoringGuiado.Persistance.Database.mappers;

import com.babel.ScoringGuiado.Models.Renta;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface RentaMapper {

    @Insert("INSERT INTO RENTA_ANUAL (persona_id,profesion_id, anio, importe, is_cuenta_propia, iae, cif_empleador, fecha_inicio_empleo) VALUES (#{persona.personaId}, #{profesion.profesionId}, #{anio}, #{importe} , #{isCuentaPropia,jdbcType=NUMERIC} , #{iae, jdbcType=CHAR}, #{cifEmpleador, jdbcType=VARCHAR}, #{fechaInicioEmpleo, jdbcType=DATE})")
    @Options(useGeneratedKeys = true, keyProperty = "rentaId", keyColumn="RENTA_ID")
    void insert(Renta renta);


}
