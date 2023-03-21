package com.babel.ScoringGuiado.Services.Impl;

import com.babel.ScoringGuiado.Exceptions.RequiredMissingFieldException;
import com.babel.ScoringGuiado.Models.Persona;
import com.babel.ScoringGuiado.Persistance.Database.mappers.DireccionMapper;
import com.babel.ScoringGuiado.Persistance.Database.mappers.PersonaMapper;
import com.babel.ScoringGuiado.Services.PersonaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {
    private DireccionMapper direccionMapper;
    private PersonaMapper personaMapper;

    public PersonaServiceImpl(PersonaMapper personaMapper,DireccionMapper direccionMapper) {
        this.personaMapper = personaMapper;
        this.direccionMapper = direccionMapper;
    }

    @Override
    @Transactional
    public Persona addPersona(Persona persona) throws RequiredMissingFieldException{
        this.validatePersonaData(persona);

        persona = addPersonaDireccion(persona);
        this.personaMapper.insertPersona(persona);

        return persona;

    }

    private Persona addPersonaDireccion(Persona persona){
        this.direccionMapper.insertDireccion(persona.getDireccionDomicilio());
        if(persona.isDireccionDomicilioSameAsNotification()){
            persona.setDireccionNotificacion(persona.getDireccionDomicilio());
        }
        else{
            this.direccionMapper.insertDireccion(persona.getDireccionNotificacion());
        }
        return persona;
    }

    private void validatePersonaData(Persona persona) throws RequiredMissingFieldException{
        this.validateNombre(persona);

    }
    private void validateNombre(Persona persona) throws RequiredMissingFieldException{
        if(persona.getNombre() == null || persona.getNombre().isEmpty()){
            throw new RequiredMissingFieldException();
        }
    }
}
