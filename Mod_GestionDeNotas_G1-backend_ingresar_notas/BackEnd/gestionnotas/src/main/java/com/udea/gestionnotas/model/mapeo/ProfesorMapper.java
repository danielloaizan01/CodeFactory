package com.udea.gestionnotas.model.mapeo;


import com.udea.gestionnotas.model.dto.Profesor;
import com.udea.gestionnotas.model.entity.ProfesorE;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProfesorMapper {

    @Mapping(source = "profesorId", target = "profesorId")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "tipo", target = "tipo")
    @Mapping(source = "correoElectronico", target = "correoElectronico")
    @Mapping(source = "usuarioPortal", target = "usuarioPortal")
    Profesor toProfesor(ProfesorE profesorE);
}
