package com.babel.ScoringGuiado.Controllers;

import com.babel.ScoringGuiado.Exceptions.ForeignKeyNotFoundException;
import com.babel.ScoringGuiado.Models.Renta;
import com.babel.ScoringGuiado.Services.RentaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentaController {
    private RentaService rentaService;

    public RentaController(RentaService rentaService) {
        this.rentaService = rentaService;
    }

    @PostMapping("/renta")
    ResponseEntity addRenta(@RequestBody Renta renta){
        try {
            renta = this.rentaService.addRenta(renta);
        } catch (ForeignKeyNotFoundException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No existe la persona o la profesion");
        }
        return ResponseEntity.ok(String.format("Renta añadida. id: %d",renta.getRentaId()));
    }
}
