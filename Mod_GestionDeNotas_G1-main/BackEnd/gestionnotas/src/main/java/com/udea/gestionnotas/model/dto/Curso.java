package com.udea.gestionnotas.model.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Curso implements Serializable {
    private int cursoId;
    private String nombre;
    private int creditos;
    private String codigo;
    private List<Grupo> grupos = new ArrayList<>();
}
