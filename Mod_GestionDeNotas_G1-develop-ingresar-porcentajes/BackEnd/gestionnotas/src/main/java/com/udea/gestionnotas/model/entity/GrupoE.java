package com.udea.gestionnotas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "grupo" )
public class GrupoE {
    @Id
    @Column(name = "grupo_id") //nombre en snake case
    private int grupoId; //nombre en camelcase
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "profesor_id")
    private int profesorId;
    @Column(name = "curso_id")
    private int cursoId;
    @Column(name = "semestreA_id")
    private int semestreAId;
    @Column(name = "horario")
    private String horario;


}
