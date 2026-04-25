package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import org.hibernate.validator.constraints.URL;

import com.programacion4.unidad4ej5.feature.socio.validation.OnCreate;
import com.programacion4.unidad4ej5.feature.socio.validation.OnUpdate;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

public class SocioUpdateDTO {

    @NotNull(groups = OnUpdate.class)
    @Null(groups = OnCreate.class)
    private Long id;

    @URL(message = "La foto de ser un enlace valido")
    private String urlFoto;

    @Size(min = 3, max = 15)
    @Pattern(regexp = "^\\S*$", message = "El nombre no puede contener espacios")
    private String alias;    

}
