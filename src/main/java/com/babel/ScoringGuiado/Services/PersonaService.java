package com.babel.ScoringGuiado.Services;

import com.babel.ScoringGuiado.Exceptions.RequiredMissingFieldException;
import com.babel.ScoringGuiado.Models.Persona;

public interface PersonaService {
    Persona addPersona(Persona persona) throws RequiredMissingFieldException;
}
