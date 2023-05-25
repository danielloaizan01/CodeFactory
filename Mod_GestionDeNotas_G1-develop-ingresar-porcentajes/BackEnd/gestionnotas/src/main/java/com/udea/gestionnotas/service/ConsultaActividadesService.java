package com.udea.gestionnotas.service;

import com.udea.gestionnotas.dao.ActividadDao;
import com.udea.gestionnotas.dao.GrupoDao;
import com.udea.gestionnotas.model.dto.Actividad;
import com.udea.gestionnotas.model.entity.ActividadE;
import com.udea.gestionnotas.model.mapeo.ActividadMapper;
import com.udea.gestionnotas.model.mapeo.GrupoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaActividadesService implements ConsultaActividadesServiceInterface{

    @Autowired
    private ActividadDao actividadDao;

    @Autowired
    private ActividadMapper actividadMapper;

    @Override
    public List<Actividad> getActividad(int grupoId) {
        List<ActividadE> actividadesE = actividadDao.findBygrupoId(grupoId);
        List<Actividad> activades = actividadMapper.actividadEtoActividadList(actividadesE);
        return activades;
    }

    public void saveActividades(List<Actividad> actividades) {
        List<ActividadE> actividadesE = actividadMapper.actividadtoActividadEList(actividades);
        actividadDao.saveAll(actividadesE);
    }
}
