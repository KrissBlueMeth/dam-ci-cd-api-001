package com.dam.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EstadoControlador {

    @GetMapping("/")
    public String home() {
        return "¡Práctica de Arquitectura en la Nube finalizada by Cris!.";
    }

    @GetMapping("/api/estado")
    public Map<String, Object> estado() {
        return Map.of(
                "estado", "OK",
                "servicio", "dam-ci-cd-api-001",
                "mensaje", "API operativa"
        );
    }
}