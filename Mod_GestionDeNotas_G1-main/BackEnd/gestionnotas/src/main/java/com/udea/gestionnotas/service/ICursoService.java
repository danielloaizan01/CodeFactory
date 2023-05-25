package com.udea.gestionnotas.service;

import com.udea.gestionnotas.model.dto.Curso;
import com.udea.gestionnotas.model.dto.Grupo;
import com.udea.gestionnotas.model.dto.Profesor;

import java.util.List;


public interface ICursoService {

    List<Curso> getCursosProfesor(int profesorId);
    Curso getCurso(int idCurso);
    List<Curso> cargarGrupo(List<Curso> Cursos, Grupo grupo);

}

