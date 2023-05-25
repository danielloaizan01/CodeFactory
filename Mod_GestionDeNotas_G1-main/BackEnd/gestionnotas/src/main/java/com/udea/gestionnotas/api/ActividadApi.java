package com.udea.gestionnotas.api;

import com.udea.gestionnotas.model.dto.Actividad;
import com.udea.gestionnotas.service.IActividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/V1/Actividades")
public class ActividadApi {
    @Autowired
    IActividadService actividadService;
    @PostMapping("")
    public void saveActividades(@RequestBody List<Actividad> actividades ) {
        actividadService.saveActividades(actividades);
    }

}
