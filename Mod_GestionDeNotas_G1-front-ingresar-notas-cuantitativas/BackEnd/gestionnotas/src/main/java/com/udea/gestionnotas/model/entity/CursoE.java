package com.udea.gestionnotas.model.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "curso" )
public class CursoE {

    @Id
    @Column(name = "curso_id") //nombre en snake case
    private int cursoId; //nombre en camelcase
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "credito")
    private int creditos;
    @Column(name = "codigo")
    private String codigo;
}
