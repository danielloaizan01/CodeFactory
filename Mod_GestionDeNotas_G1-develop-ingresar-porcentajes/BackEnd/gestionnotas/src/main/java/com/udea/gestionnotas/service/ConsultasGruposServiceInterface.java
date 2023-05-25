package com.udea.gestionnotas.service;

import com.udea.gestionnotas.model.dto.Curso;
import com.udea.gestionnotas.model.dto.Grupo;
import com.udea.gestionnotas.model.dto.Profesor;

import java.util.List;


public interface ConsultasGruposServiceInterface {
    List<Grupo> getGruposProfesor(int profesorId);
    List<Curso> getCursosProfesor(int profesorId);
    public Curso getCurso(int idCurso);
    List<Curso> cargarGrupo(List<Curso> Cursos, Grupo grupo);
    Profesor getProfesor(int idProfesor);
}

