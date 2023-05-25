package com.udea.gestionnotas.model.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.List;


@Entity
@Data
@Table(name = "estudiante" )
public class EstudianteE {

    @Id
    @Column(name = "estudiante_id")
    private int estudianteId;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "correo")
    private String correo;
    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;


    @ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
    })
    @JoinTable(
        name = "grupo_estudiante",
        joinColumns = {@JoinColumn(name = "estudiante_id")},
        inverseJoinColumns = {@JoinColumn(name = "grupo_id")}
    )
    private List<GrupoE> grupos;


}
