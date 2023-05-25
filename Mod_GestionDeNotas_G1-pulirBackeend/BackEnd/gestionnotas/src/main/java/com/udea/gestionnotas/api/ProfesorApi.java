package com.udea.gestionnotas.api;

import com.udea.gestionnotas.model.dto.Profesor;
import com.udea.gestionnotas.service.IProfesorService;
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

@RestController
@RequestMapping("/api/V1/profesor")
public class ProfesorApi {

  @Autowired
  private IProfesorService profesorService;

  @Operation(summary = "Obtiene los datos de un profesor")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Encontró el profesor problema",
          content = { @Content(mediaType = "application/json",
              schema = @Schema(implementation = Profesor.class)) }),
      @ApiResponse(responseCode = "204", description = "No se encontraro el profesor",
          content = @Content),
      @ApiResponse(responseCode = "404", description = "No se encontró el profesor ingresado",
          content = @Content) })
  @GetMapping("/{profesorId}")
  public ResponseEntity<Profesor> getProfesor(@PathVariable("profesorId") int profesorId){
    //Si el profesor no existe => NOT_FOUND
    if(profesorService.getProfesor(profesorId) == null){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    Profesor profesor  = profesorService.getProfesor(profesorId);

    return ResponseEntity.status(HttpStatus.OK).body(profesor);
  }

}
