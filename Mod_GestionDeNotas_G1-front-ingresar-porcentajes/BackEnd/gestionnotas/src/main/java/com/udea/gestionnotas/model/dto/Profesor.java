package com.udea.gestionnotas.model.dto;

import lombok.Data;

@Data
public class Profesor {
    private int profesorId;
    private String nombre;
    private String tipo;
    private String correoElectronico;
    private String usuarioPortal;
}
