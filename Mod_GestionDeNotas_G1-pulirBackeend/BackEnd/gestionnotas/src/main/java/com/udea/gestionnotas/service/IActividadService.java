package com.udea.gestionnotas.service;

import com.udea.gestionnotas.model.dto.Actividad;

import java.util.List;

public interface IActividadService {


    List<Actividad> getActividad(int grupoId);

    void saveActividades(List<Actividad> actividades);

}
