package com.babel.ScoringGuiado.Controllers;

import com.babel.ScoringGuiado.Models.Renta;
import com.babel.ScoringGuiado.Services.RentaService;
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
        renta = this.rentaService.addRenta(renta);
       // return ResponseEntity.ok(renta);
        return ResponseEntity.ok(String.format("Renta añadida. id: %d",renta.getRentaId()));
    }
}
