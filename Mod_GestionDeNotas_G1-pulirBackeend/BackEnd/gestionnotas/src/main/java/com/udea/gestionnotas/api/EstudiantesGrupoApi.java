package com.udea.gestionnotas.api;

import com.udea.gestionnotas.model.dto.Estudiante;
import com.udea.gestionnotas.service.IEstudiantesGrupoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/V1/Profesor")
public class EstudiantesGrupoApi {

    @Autowired
    private IEstudiantesGrupoService estudiantesGrupoService;
    @Operation(summary = "Obtiene todos los Estudiantes de un grupo")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Encontró los estudiantes sin problema",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Estudiante.class)) }),
            @ApiResponse(responseCode = "204", description = "No se encontraron estudiantes del grupo",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "No se encontró el grupo",
                    content = @Content) })
    @GetMapping("/grupo/estudiantes/{grupoId}")
    public ResponseEntity<List<Estudiante>> getEstudiantes(@PathVariable("grupoId") int grupoId){

        if(estudiantesGrupoService.getEstudiantesGrupo(grupoId) == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        List<Estudiante> estudiantes = estudiantesGrupoService.getEstudiantesGrupo(grupoId);

        return ResponseEntity.status(HttpStatus.OK).body(estudiantes);
    }
}
