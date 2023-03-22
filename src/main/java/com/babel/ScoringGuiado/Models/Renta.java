package com.babel.ScoringGuiado.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Renta {
    private int rentaId;
    private Profesion profesion;
    private int anio;
    private int importe;
    private boolean isCuentaPropia;
    private String iae;
    private String cifEmpleado;
    private Date fechaInicioEmpleo;
}
