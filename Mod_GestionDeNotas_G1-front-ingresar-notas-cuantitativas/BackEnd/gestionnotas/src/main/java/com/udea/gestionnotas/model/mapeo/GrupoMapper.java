package com.udea.gestionnotas.model.mapeo;

import com.udea.gestionnotas.model.dto.Grupo;
import com.udea.gestionnotas.model.entity.GrupoE;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface GrupoMapper {

    @Mapping(source = "grupoId", target = "grupoId")
    @Mapping(source = "codigo", target = "codigo")
    @Mapping(source = "profesorId", target = "profesorId")
    @Mapping(source = "cursoId", target = "cursoId")
    @Mapping(source = "horario", target = "horario")
    Grupo toGrupo(GrupoE grupoE);
    List<Grupo> grupoEtoGrupoList(List<GrupoE> grupoEList);
}
