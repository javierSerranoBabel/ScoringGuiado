package com.babel.ScoringGuiado.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Direccion {
    private int direccionId;
    private int tipoVia;
    private String nombreCalle;
    private String numero;
    private String codPostal;
    private String municipio;
    private String provinciaCod;
}
