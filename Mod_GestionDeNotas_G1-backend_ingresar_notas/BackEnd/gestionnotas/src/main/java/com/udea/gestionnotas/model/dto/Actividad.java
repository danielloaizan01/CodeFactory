package com.udea.gestionnotas.model.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class Actividad {
    private int actividadId;
    private int grupoId;
    private String descripcion;
    private int porcentaje;
}
