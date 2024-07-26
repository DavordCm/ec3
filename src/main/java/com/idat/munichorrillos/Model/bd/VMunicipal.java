package com.idat.munichorrillos.Model.bd;

import com.idat.munichorrillos.Model.bd.Personal;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "vmunicipal")
public class VMunicipal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVehiculoMunicipal;

    private String placa;
    private String marca;
    private String modelo;
    private String nMotor;
    private Integer año;
    private String color;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "idPersonal")
    private Personal personal;
}
