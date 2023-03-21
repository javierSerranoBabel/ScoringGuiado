package com.babel.ScoringGuiado.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Persona {
    private int personaId;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Direccion direccionDomicilio;
    private boolean direccionDomicilioSameAsNotification = true;
    private Direccion direccionNotificacion;
    private String nif;
    private String nacionalidad;
    private Date fechaNacimiento;
    private int scoring;
    private Date fechaScoring;

}
