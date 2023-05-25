package com.udea.gestionnotas.dao;


import com.udea.gestionnotas.model.entity.ActividadE;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActividadDao extends CrudRepository<ActividadE, Integer> {

    List<ActividadE> findBygrupoId(int grupo_id);

    ActividadE save(ActividadE actividadE);
}
