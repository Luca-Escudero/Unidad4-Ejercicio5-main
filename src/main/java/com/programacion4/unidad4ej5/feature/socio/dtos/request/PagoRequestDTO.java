package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import java.time.LocalDate;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data

public class PagoRequestDTO {

    @DecimalMin("1000.00")
    @Digits(integer = 10, fraction = 2)
    private double monto;

    @Pattern(regexp = "PAY-[A-Z0-0]{4}-.*")
    private String codigo_transaccion;

    @Future
    private LocalDate fecha_vencimiento;

    @NotBlank(message = "El tipo de pago es obligatorio")
    @Pattern(
        regexp = "^(EFECTIVO|DEBITO|CREDITO|TRANSFERENCIA)$", 
        message = "Solo se aceptan los valores: EFECTIVO, DEBITO, CREDITO, TRANSFERENCIA"
    )
    private String tipoPago;

}
