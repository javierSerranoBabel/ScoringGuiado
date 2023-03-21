package com.babel.ScoringGuiado.Controllers;

import com.babel.ScoringGuiado.Models.Persona;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @PostMapping("persona")
    ResponseEntity addPersona(@RequestBody Persona persona){
        return ResponseEntity.ok(persona);
    }
}
