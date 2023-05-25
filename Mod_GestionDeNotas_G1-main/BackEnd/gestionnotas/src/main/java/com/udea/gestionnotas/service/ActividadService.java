package com.udea.gestionnotas.service;

import com.udea.gestionnotas.dao.ActividadDao;
import com.udea.gestionnotas.model.dto.Actividad;
import com.udea.gestionnotas.model.entity.ActividadE;
import com.udea.gestionnotas.model.mapeo.ActividadMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadService implements IActividadService {
    @Autowired
    private ActividadDao actividadDao;
    @Autowired
    private ActividadMapper actividadMapper;

    @Override
    public List<Actividad> getActividad(int grupoId) {
        List<ActividadE> actividadesE = actividadDao.findBygrupoId(grupoId);
        List<Actividad> actividades = actividadMapper.actividadEtoActividadList(actividadesE);
        return actividades;
    }

    public void saveActividades(List<Actividad> actividades) {
        List<ActividadE> actividadesE = actividadMapper.actividadtoActividadEList(actividades);

        System.out.println(actividadesE);
        actividadDao.saveAll(actividadesE);
    }
}
