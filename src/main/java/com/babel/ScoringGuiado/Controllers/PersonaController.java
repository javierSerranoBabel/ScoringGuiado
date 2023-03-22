package com.babel.ScoringGuiado.Controllers;

import com.babel.ScoringGuiado.Exceptions.RequiredMissingFieldException;
import com.babel.ScoringGuiado.Models.Persona;
import com.babel.ScoringGuiado.Services.Impl.PersonaServiceImpl;
import com.babel.ScoringGuiado.Services.PersonaService;
import org.springframework.http.HttpStatus;
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

    @PostMapping("/persona")
    ResponseEntity addPersona(@RequestBody Persona persona){


        try {
            this.personaService.addPersona(persona);
        } catch (RequiredMissingFieldException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Comprueba los datos de entrada");
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return ResponseEntity.ok(String.format("Persona añadida. id: %d",persona.getPersonaId()));
    }

    @PostMapping("/renta")
    ResponseEntity addRenta(){
        return ResponseEntity.ok("Endpoint renta encontrado");
    }
}
