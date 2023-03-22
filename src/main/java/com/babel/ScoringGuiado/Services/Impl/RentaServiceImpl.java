package com.babel.ScoringGuiado.Services.Impl;

import com.babel.ScoringGuiado.Exceptions.ForeignKeyNotFoundException;
import com.babel.ScoringGuiado.Models.Renta;
import com.babel.ScoringGuiado.Persistance.Database.mappers.PersonaMapper;
import com.babel.ScoringGuiado.Persistance.Database.mappers.ProfesionMapper;
import com.babel.ScoringGuiado.Persistance.Database.mappers.RentaMapper;
import com.babel.ScoringGuiado.Services.RentaService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.stereotype.Service;

@Service
public class RentaServiceImpl implements RentaService {
    private RentaMapper rentaMapper;
    private PersonaMapper personaMapper;
    private ProfesionMapper profesionMapper;

    public RentaServiceImpl(PersonaMapper personaMapper, RentaMapper rentaMapper,ProfesionMapper profesionMapper) {
        this.personaMapper = personaMapper;
        this.rentaMapper = rentaMapper;
        this.profesionMapper =  profesionMapper;
    }

    @Override
    public Renta addRenta(Renta renta) throws ForeignKeyNotFoundException {
        this.validateRenta(renta);
        this.rentaMapper.insert(renta);
        return renta;
    }

    private void validateRenta(Renta renta) throws ForeignKeyNotFoundException {
        validatePersona(renta);
        validateProfesion(renta);


    }

    private void validatePersona(Renta renta) throws ForeignKeyNotFoundException {
        if (renta.getPersona() == null || this.personaMapper.checkPersonaExists(renta.getPersona()) == null ){
            throw new ForeignKeyNotFoundException();
        }


    }
    private void validateProfesion(Renta renta) throws ForeignKeyNotFoundException{
        if(renta.getProfesion() == null ||this.profesionMapper.checkProfesionExists(renta.getProfesion()) == null){
            throw new ForeignKeyNotFoundException();
        }
    }
}
