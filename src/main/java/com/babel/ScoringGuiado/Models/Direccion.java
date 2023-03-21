package com.babel.ScoringGuiado.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Direccion {
    private int direccionId;
    private int tipoViaId;
    private String nombreCalle;
    private String numero;
    private String piso;
    private String codPostal;
    private String municipio;
    private String provinciaCod;
}
