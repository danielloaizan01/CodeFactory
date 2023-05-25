package com.udea.gestionnotas.model.entity;


import javax.persistence.*;

@Entity
@Table(name = "grupo_estudiante")
public class EstudiantesGrupoE {

    //TABLA INTERMEDIA
    @Id
    @Column(name = "grupo_estudiante_id")
    private int grupoEstudianteId;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private EstudianteE estudianteE;

    @ManyToOne
    @JoinColumn(name = "grupo_id")
    private GrupoE grupoE;

}
