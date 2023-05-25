package com.udea.gestionnotas.service;

import com.udea.gestionnotas.dao.GrupoDao;
import com.udea.gestionnotas.model.dto.Grupo;
import com.udea.gestionnotas.model.mapeo.GrupoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrupoService implements IGrupoService{

  @Autowired
  private GrupoDao grupoDao;
  @Autowired
  private GrupoMapper grupoMapper;

  @Override
  public Grupo getGrupo(int grupoId) {
    return grupoMapper.toGrupo(grupoDao.findById(grupoId));
  }


}
