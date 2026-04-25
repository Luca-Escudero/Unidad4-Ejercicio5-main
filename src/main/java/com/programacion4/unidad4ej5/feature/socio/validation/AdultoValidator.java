package com.programacion4.unidad4ej5.feature.socio.validation;

import java.time.LocalDate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AdultoValidator implements ConstraintValidator<Adulto, LocalDate> {
    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        if (value == null) return false;
        // Compara si la fecha ingresada más 18 años es antes o igual a hoy
        return value.plusYears(18).isBefore(LocalDate.now()) || 
               value.plusYears(18).isEqual(LocalDate.now());
    }
}
