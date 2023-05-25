package com.udea.gestionnotas.service;


import com.udea.gestionnotas.dao.GrupoDao;
import com.udea.gestionnotas.dao.EstudiantesGrupoDao;
import com.udea.gestionnotas.model.dto.Estudiante;
import com.udea.gestionnotas.model.entity.GrupoE;
import com.udea.gestionnotas.model.mapeo.EstudianteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EstudiantesGruposService implements IEstudiantesGrupoService{

    @Autowired
    private EstudiantesGrupoDao estudiantesGrupoDao;
    @Autowired
    private GrupoDao grupoDao;
    @Autowired
    private EstudianteMapper mapperEstudiate;

    public List<Estudiante> getEstudiantesGrupo(int idGrupo) {
        GrupoE grupoE = grupoDao.findById(idGrupo);
        return mapperEstudiate.estudianteEtoEstudianteList(grupoE.getEstudiantes());
    }
}
