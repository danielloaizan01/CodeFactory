package com.udea.gestionnotas.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.udea.gestionnotas.model.entity.GrupoE;


@Repository
public interface GrupoDao extends CrudRepository<GrupoE, Integer> {
    GrupoE findById(int grupo_id);
    List<GrupoE> findByprofesorId(int profesor_id);

}
