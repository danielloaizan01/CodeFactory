package com.udea.gestionnotas.service;

import com.udea.gestionnotas.dao.CursoDao;
import com.udea.gestionnotas.dao.GrupoDao;
import com.udea.gestionnotas.dao.ProfesorDao;
import com.udea.gestionnotas.model.dto.Curso;
import com.udea.gestionnotas.model.dto.Grupo;
import com.udea.gestionnotas.model.dto.Profesor;
import com.udea.gestionnotas.model.mapeo.CursoMapper;
import com.udea.gestionnotas.model.mapeo.GrupoMapper;
import com.udea.gestionnotas.model.mapeo.ProfesorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;



@Service
public class ConsultasGruposService implements ConsultasGruposServiceInterface {

    @Autowired
    private GrupoDao grupoDao;
    @Autowired
    private GrupoMapper grupoMapper;
    @Autowired
    private CursoDao cursoDao;
    @Autowired
    private CursoMapper cursoMapper;
    @Autowired
    private ProfesorDao profesorDao;
    @Autowired
    private ProfesorMapper profesorMapper;
    
    @Override
    public List<Grupo> getGruposProfesor(int idProfesor) { //obtiene los grupos de un profesor
        return grupoMapper.grupoEtoGrupoList(grupoDao.findByprofesorId(idProfesor));
    }
    @Override
    public List<Curso> getCursosProfesor(int idProfesor) { //obtiene los cursos de un profesor junto a los grupos
        List<Grupo> grupos = this.getGruposProfesor(idProfesor);
        List<Curso> cursos = new ArrayList<Curso>();
        for (Grupo grupo : grupos) { //recorre todos los grupos
            cursos = this.cargarGrupo(cursos, grupo); //agrega los grupos al curso correspondiente de la lista de cursos
        }
        return cursos;
    }
    @Override
    public Curso getCurso(int idCurso) { //obtiene un curso por id
        return cursoMapper.toCurso(cursoDao.findById(idCurso));
    }
    @Override
    public List<Curso> cargarGrupo(List<Curso> Cursos, Grupo grupo) { //guarda un grupo en un curso de la lista
        Curso curso = Cursos.stream() //busca el curso en la lista
                .filter(o -> o.getCursoId() == grupo.getCursoId())
                .findFirst()
                .orElse(null);

        if (curso == null) { // si el curso no existe, lo busca en base de datos y lo añade a la lista
            curso = this.getCurso(grupo.getCursoId());
            Cursos.add(curso);
        }
        List<Grupo> grupos = curso.getGrupos();
        grupos.add(grupo);
        curso.setGrupos(grupos); //agrega el grupo al curso
        return Cursos;
    }

    @Override
    public Profesor getProfesor(int idProfesor){
        return profesorMapper.toProfesor(profesorDao.findById(idProfesor));
    }
}
