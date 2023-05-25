package com.udea.gestionnotas.dao;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udea.gestionnotas.model.entity.CursoE;


@Repository
public interface CursoDao extends CrudRepository<CursoE, Integer> {
    CursoE findById(int curso_id);
}

