package com.idat.munichorrillos.Model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_Empleado;

    private String Nom_Empleado;
    private String ApellidoP;
    private String ApellidoM;
    private String Email;
    private String Telefono;
    private String Direccion;
    private Date FechaIngreso;
    private Integer Activo;
    private String EstadoCivil;
    private Integer NroIdentidad;

    @ManyToOne
    @JoinColumn(name = "IdTipoDoc")
    private TipoDoc TipoDoc;

    @ManyToOne
    @JoinColumn(name = "IdHorario")
    private Horario Horario;

    @ManyToOne
    @JoinColumn(name = "Id_Area")
    private Area Area;
}
