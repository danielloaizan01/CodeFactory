package com.udea.gestionnotas.service;

import com.udea.gestionnotas.dao.EstudianteDao;
import com.udea.gestionnotas.model.dto.Estudiante;
import com.udea.gestionnotas.model.mapeo.EstudianteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService implements IEstudianteService {

    @Autowired
    private EstudianteDao estudianteDao;
    @Autowired
    private EstudianteMapper estudianteMapper;
    @Override
    public Estudiante getEstudiante(int estudianteId) {
        return estudianteMapper.toEstudiante(estudianteDao.findById(estudianteId));
    }
}
