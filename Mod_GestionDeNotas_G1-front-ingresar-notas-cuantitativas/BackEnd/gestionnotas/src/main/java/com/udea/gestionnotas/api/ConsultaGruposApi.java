package com.udea.gestionnotas.api;

import java.net.http.HttpRequest;
import java.util.List;
import com.udea.gestionnotas.model.dto.Curso;
import com.udea.gestionnotas.service.ConsultasGruposServiceInterface;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.udea.gestionnotas.model.dto.Grupo;

@RestController
@RequestMapping("/api/V1/Profesor")
public class ConsultaGruposApi{

    @Autowired
    private ConsultasGruposServiceInterface consultasGruposServiceInterface;

    @Operation(summary = "Obtiene todos los cursos para el profesor ingresado")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Encontró los cursos sin problema",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Curso.class)) }),
            @ApiResponse(responseCode = "204", description = "No se encontraron cusros para el profesor",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "No se encontró el profesor ingresado",
                    content = @Content) })
    @GetMapping("/grupos/{profesorId}")
    public ResponseEntity<List<Curso>> getGrupos(@PathVariable("profesorId") int profesorId){
        //Si el profesor no existe => NOT_FOUND
        if(consultasGruposServiceInterface.getProfesor(profesorId) == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        //Si la conexión a base de datos falla => (PENDIENTE)

        List<Curso> cursos = consultasGruposServiceInterface.getCursosProfesor(profesorId);
        //Si no existen cursos para el profesor => NO_CONTENT
        if(cursos.isEmpty()){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
        }
        //Si no hay ningún problema => OK
        return ResponseEntity.status(HttpStatus.OK).body(cursos);
    }
}
