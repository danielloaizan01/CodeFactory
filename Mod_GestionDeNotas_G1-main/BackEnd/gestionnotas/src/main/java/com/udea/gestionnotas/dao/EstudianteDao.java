package com.udea.gestionnotas.dao;


import com.udea.gestionnotas.model.entity.EstudianteE;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteDao extends CrudRepository<EstudianteE, Integer>{
    EstudianteE findById(int estudiante_id);

}
