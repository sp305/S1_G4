package com.example.AgenciaTurismo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FlightsAvailableDto {
    private String nroVuelo;
    private String origen;
    private String destino;
    private String tipoAsiento;
    private Double precioPersona;
    private LocalDate fechaIda;
    private LocalDate fechaVuelta;

}
