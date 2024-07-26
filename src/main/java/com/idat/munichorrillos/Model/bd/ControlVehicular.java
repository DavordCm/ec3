package com.idat.munichorrillos.Model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
@Entity
@Table(name = "controlvehicular")
public class ControlVehicular {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idControl;

    private String placa;
    private Time hIngreso;
    private Time hSalida;
    private Date dia;
}
