package com.programacion4.unidad4ej5.feature.socio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.PagoRequestDTO;
import com.programacion4.unidad4ej5.feature.socio.dtos.request.PlanCreateDTO;
import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioCreateDTO;
import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioUpdateDTO;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.SocioResponseDTO;
import com.programacion4.unidad4ej5.feature.socio.validation.OnUpdate;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")

public class SocioController {

    @PostMapping("/nuevo_socio")
    public ResponseEntity<SocioResponseDTO> crearSocio(@Valid @RequestBody SocioCreateDTO socio) {
        SocioResponseDTO socioResponse = new SocioResponseDTO();
        socioResponse.setId(1L);
        socioResponse.setNombre(socio.getNombre());
        socioResponse.setApellido(socio.getApellido());
        socioResponse.setEmail(socio.getEmail());
        socioResponse.setDni(socio.getDni());
        socioResponse.setFechaNacimiento(socio.getFechaNacimiento());
        socioResponse.setTelefono(socio.getTelefono());

        return ResponseEntity.status(HttpStatus.CREATED).body(socioResponse);
        
    }

    @PostMapping("/nuevo_plan")
    public String crearPlan(@Valid @RequestBody PlanCreateDTO plan) { 
        
        return "Plan creado";
    }

    @PostMapping("/pagos")
    public String registrarPago(@Valid @RequestBody PagoRequestDTO dto) {
        return "Pago validado con éxito";
    }

    @PutMapping("/socios/{id}")
    public String actualizar(@Validated(OnUpdate.class) @RequestBody SocioUpdateDTO dto) {
        return "Actualización validada con éxito";
    }
    
    

}
