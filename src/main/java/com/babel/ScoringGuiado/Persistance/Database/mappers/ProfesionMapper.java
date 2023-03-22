package com.babel.ScoringGuiado.Persistance.Database.mappers;


import com.babel.ScoringGuiado.Models.Profesion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProfesionMapper {

    @Select("SELECT profesion_id FROM PROFESION WHERE  PROFESION_ID=#{profesionId}")
    Integer checkProfesionExists(Profesion profesion);
}
