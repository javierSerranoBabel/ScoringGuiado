package com.babel.ScoringGuiado.Services.Impl;

import com.babel.ScoringGuiado.Models.Persona;
import com.babel.ScoringGuiado.Services.PersonaService;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Override
    public Persona addPersona(Persona persona) {

        System.out.println("Llamada a servicio Persona addPersona");
        return persona;
    }
}
