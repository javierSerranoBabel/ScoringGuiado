package com.babel.ScoringGuiado.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    ResponseEntity addPersona(){
        return ResponseEntity.ok("Add persona encontrada");
    }
}
