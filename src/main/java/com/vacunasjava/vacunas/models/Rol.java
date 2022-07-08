package com.vacunasjava.vacunas.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter @Setter @Column(name="id_rol")
    private Integer idRol;
    @Getter @Setter @Column(name="nombre_rol")
    private String nombreRol;
}
