package com.babel.ScoringGuiado.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @PostMapping("persona")
    ResponseEntity addPersona(){
        return ResponseEntity.ok("Add persona encontrada");
    }
}
