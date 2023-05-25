package com.udea.gestionnotas.dao;

import java.util.List;
import com.udea.gestionnotas.model.entity.EstudianteE;
import com.udea.gestionnotas.model.entity.EstudiantesGrupoE;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstudiantesGrupoDao extends CrudRepository<EstudiantesGrupoE, Integer> {
    List<EstudianteE> findEstudiantesEByGrupoE(int idgrupo);
}
