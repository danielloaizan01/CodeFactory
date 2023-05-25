package com.udea.gestionnotas.service;

import com.udea.gestionnotas.model.dto.Estudiante;
import com.udea.gestionnotas.model.dto.EstudiantesGrupo;
import com.udea.gestionnotas.model.dto.Grupo;

import java.util.List;

public interface IEstudiantesGrupoService { List<Estudiante> getEstudiantesGrupo(int idGrupo); }
