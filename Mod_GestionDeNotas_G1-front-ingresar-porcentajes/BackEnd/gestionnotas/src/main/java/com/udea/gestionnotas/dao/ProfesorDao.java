package com.udea.gestionnotas.dao;

import com.udea.gestionnotas.model.entity.ProfesorE;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorDao  extends CrudRepository<ProfesorE, Integer> {
    ProfesorE findById(int profesor_id);
}
