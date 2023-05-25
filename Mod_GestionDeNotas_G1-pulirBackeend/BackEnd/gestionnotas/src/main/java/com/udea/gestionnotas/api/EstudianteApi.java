package com.udea.gestionnotas.api;

import com.udea.gestionnotas.model.dto.Curso;
import com.udea.gestionnotas.model.dto.Estudiante;

import com.udea.gestionnotas.service.IEstudianteService;
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
@RequestMapping("/api/V1/Estudiante")
public class EstudianteApi {

    @Autowired
    private IEstudianteService estudianteService;

    @Operation(summary = "Obtiene los datos de un estudiante")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Encontró el estudiante problema",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Estudiante.class)) }),
            @ApiResponse(responseCode = "204", description = "No se encontraro el estudiante",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "No se encontró el estudiante ingresado",
                    content = @Content) })
    @GetMapping("/{estudianteId}")
    public ResponseEntity<Estudiante> getEstudiante(@PathVariable("estudianteId") int estudianteId){
        //Si el estudiante no existe => NOT_FOUND
        if(estudianteService.getEstudiante(estudianteId) == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        Estudiante estudiante = estudianteService.getEstudiante(estudianteId);
        //Si no hay ningún problema => OK
        return ResponseEntity.status(HttpStatus.OK).body(estudiante);
    }

}
