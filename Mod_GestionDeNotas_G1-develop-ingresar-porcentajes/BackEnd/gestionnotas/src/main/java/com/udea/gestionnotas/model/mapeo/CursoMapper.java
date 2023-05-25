package com.udea.gestionnotas.model.mapeo;

import com.udea.gestionnotas.model.dto.Curso;
import com.udea.gestionnotas.model.entity.CursoE;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CursoMapper {

    @Mapping(source = "cursoId", target = "cursoId")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "creditos", target = "creditos")
    @Mapping(source = "codigo", target = "codigo")
    Curso toCurso(CursoE cursoE);
    List<Curso> cursoEtoCursoList(List<CursoE> cursoEList);
}
