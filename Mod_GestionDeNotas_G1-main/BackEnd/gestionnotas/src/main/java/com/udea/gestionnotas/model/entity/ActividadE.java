package com.udea.gestionnotas.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "actividad" )
public class ActividadE {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "actividad_id")
    private int actividadId;
    @Column(name = "grupo_id")
    private int grupoId;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "porcentaje")
    private int porcentaje;
}
