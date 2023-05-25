package com.udea.gestionnotas.model.mapeo;

import com.udea.gestionnotas.model.dto.Estudiante;
import com.udea.gestionnotas.model.entity.EstudianteE;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import java.util.List;

@Mapper(componentModel = "spring")
public interface EstudianteMapper {

    @Mapping(source = "estudianteId", target = "estudianteId")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "correo", target = "correo")
    @Mapping(source = "numeroIdentificacion", target = "numeroIdentificacion")
    Estudiante toEstudiante(EstudianteE estudiante);

    List<Estudiante> estudianteEtoEstudianteList(List<EstudianteE> estudianteE);

}
