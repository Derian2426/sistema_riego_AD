package com.riego.sistema_riego_ad.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "monitoreoSuelo")
public class MonitoreoSuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime fecha;
    private double humedad;
    private double pH;
    private String nutrientes;
    @ManyToOne
    private ZonaRiego zonaRiego;
//getters y setters
}
