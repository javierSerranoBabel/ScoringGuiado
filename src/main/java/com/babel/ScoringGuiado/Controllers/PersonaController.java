package com.babel.ScoringGuiado.Controllers;

import com.babel.ScoringGuiado.Models.Persona;
import com.babel.ScoringGuiado.Services.Impl.PersonaServiceImpl;
import com.babel.ScoringGuiado.Services.PersonaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping("persona")
    ResponseEntity addPersona(@RequestBody Persona persona){

        this.personaService.addPersona(persona);
        return ResponseEntity.ok(persona);
    }
}
