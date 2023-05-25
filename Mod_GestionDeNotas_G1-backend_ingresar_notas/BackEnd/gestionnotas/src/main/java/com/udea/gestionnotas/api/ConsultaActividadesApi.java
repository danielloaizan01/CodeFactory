package com.udea.gestionnotas.api;

import com.udea.gestionnotas.model.dto.Actividad;
import com.udea.gestionnotas.service.ConsultaActividadesServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/V1/Actividades")
public class ConsultaActividadesApi {
    @Autowired
    ConsultaActividadesServiceInterface servicio;
    @PostMapping("")
    public void saveActividades(@RequestBody List<Actividad> actividades ) {
        servicio.saveActividades(actividades);
    }

}
