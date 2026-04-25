package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import java.util.List;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

public class PlanCreateDTO {

    @Size(min = 10, max = 200)
    private String objetivo;

    @Max(7)
    @Min(1)
    private int frecuencia_semanal;

    @DecimalMax("250.0")
    @DecimalMin("30.0")
    private double peso_inicial;

    @DecimalMax("2.5")
    @DecimalMin("1.0")
    private double altura;

    @NotEmpty
    @Size(min = 3)
    private List ejercicios;






}
