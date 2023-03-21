package com.babel.ScoringGuiado.Services.Impl;

import com.babel.ScoringGuiado.Models.Persona;
import com.babel.ScoringGuiado.Persistance.Database.mappers.DireccionMapper;
import com.babel.ScoringGuiado.Services.PersonaService;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {
    private DireccionMapper direccionMapper;

    public PersonaServiceImpl(DireccionMapper direccionMapper) {
        this.direccionMapper = direccionMapper;
    }

    @Override
    public Persona addPersona(Persona persona) {
        return addPersonaDireccion(persona);

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
}
