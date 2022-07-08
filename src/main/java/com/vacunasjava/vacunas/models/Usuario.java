package com.vacunasjava.vacunas.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name="id_user")
    private Integer id;
    @Getter @Setter @Column(name="cedula")
    private String cedula;
    @Getter @Setter @Column(name="nombre")
    private String nombre;
    @Getter @Setter @Column(name="apellido")
    private String apellido;
    @Getter @Setter @Column(name="email")
    private String email;
    @Getter @Setter @Column(name="telefono")
    private String telefono;
    @Getter @Setter @Column(name="clave")
    private String password;
    @Getter @Setter @Column(name="fecha_nacimiento")
    private Date fechaNacimiento;
    @Getter @Setter @Column(name="domicilio")
    private String domicilio;
    @Getter @Setter @Column(name="estado_vacuna")
    private String estadoVacuna;
    @Getter @Setter @Column(name="tipo_vacuna")
    private String tipoVacuna;
    @Getter @Setter @Column(name="fecha_vacuna")
    private Date fechaVacuna;
    @Getter @Setter @Column(name="dosis")
    private String dosis;


}
