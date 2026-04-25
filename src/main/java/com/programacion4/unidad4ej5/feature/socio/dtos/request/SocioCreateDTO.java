package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import java.time.LocalDate;

import com.programacion4.unidad4ej5.feature.socio.validation.Adulto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data

public class SocioCreateDTO {

    @NotBlank
    private String nombre;

    @NotBlank
    private String apellido;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Pattern(regexp = "\\d{8}")
    private String dni;

    @Past
    @Adulto (message = "")
    private LocalDate fechaNacimiento;

    @Pattern(regexp = "^\\+549\\d+$") 
    private String telefono;

}
