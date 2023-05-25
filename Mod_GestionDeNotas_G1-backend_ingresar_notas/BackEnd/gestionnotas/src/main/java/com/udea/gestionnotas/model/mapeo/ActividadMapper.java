package com.udea.gestionnotas.model.mapeo;


import com.udea.gestionnotas.model.dto.Actividad;
import com.udea.gestionnotas.model.entity.ActividadE;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ActividadMapper {
    //pasar de dto a entity sin id de la activad 
    @Mapping(source = "grupoId", target = "grupoId")
    @Mapping(source = "descripcion", target = "descripcion")
    @Mapping(source = "porcentaje", target = "porcentaje")
    ActividadE toActividadE(Actividad actividad);
    List<ActividadE> actividadtoActividadEList(List<Actividad> actividadList);
    
}
