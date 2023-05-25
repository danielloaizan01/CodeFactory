package com.udea.gestionnotas.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EstudiantesGrupo implements Serializable {

    private int grupoEstudianteId;
    private int estudianteId;
    private int grupoId;

}
