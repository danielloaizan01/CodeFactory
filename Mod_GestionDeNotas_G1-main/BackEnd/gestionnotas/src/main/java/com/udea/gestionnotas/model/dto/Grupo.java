package com.udea.gestionnotas.model.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import javax.persistence.Column;


@Data
public class Grupo implements Serializable {

    private int grupoId; //mismo nombre que en entity
    private String codigo;
    private int profesorId;
    private int cursoId;
    private String horario;
    private List<Estudiante> estudiantes = new ArrayList<>();

}

