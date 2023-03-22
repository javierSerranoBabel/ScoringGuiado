package com.babel.ScoringGuiado.Controllers;

import com.babel.ScoringGuiado.Models.Renta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentaController {
    @PostMapping("/renta")
    ResponseEntity addRenta(@RequestBody Renta renta){
        return ResponseEntity.ok(renta);
    }
}
