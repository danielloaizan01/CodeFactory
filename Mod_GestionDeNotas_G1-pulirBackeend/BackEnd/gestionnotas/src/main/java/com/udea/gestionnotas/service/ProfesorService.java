package com.udea.gestionnotas.service;

import com.udea.gestionnotas.dao.ProfesorDao;
import com.udea.gestionnotas.model.dto.Profesor;
import com.udea.gestionnotas.model.mapeo.ProfesorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService implements IProfesorService{

  @Autowired
  private ProfesorDao profesorDao;
  @Autowired
  private ProfesorMapper profesorMapper;

  @Override
  public Profesor getProfesor(int profesorId) {
    return profesorMapper.toProfesor(profesorDao.findById(profesorId));
  }
}
