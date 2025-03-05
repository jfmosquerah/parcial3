package com.example.demo.model;

// Si usas Lombok, asegúrate de tener la dependencia instalada y configurada.
// Puedes usar @Data, @AllArgsConstructor y @NoArgsConstructor.
// O bien, define manualmente getters, setters y constructores.
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    private String id;
    private String nombre;
    private double precio;
}
