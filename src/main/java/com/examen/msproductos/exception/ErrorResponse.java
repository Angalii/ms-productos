package com.examen.msproductos.exception;

import java.time.LocalDateTime;
import lombok.*;

@Data
@AllArgsConstructor
public class ErrorResponse {
    private String mensaje;
    private String detalle;
    private LocalDateTime fecha;
}
