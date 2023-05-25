package com.udea.gestionnotas.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "profesor" )
public class ProfesorE {
    @Id
    @Column(name = "profesor_id") //nombre en snake case
    private int profesorId; //nombre en camelcase
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Column(name = "usuario_portal")
    private String usuarioPortal;
}
