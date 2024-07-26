package com.idat.munichorrillos.Model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "deposito")
public class Deposito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDeposito;

    private String nomDeposito;
    private String direccion;

    @OneToMany(mappedBy = "deposito")
    private List<Multa> multas = new ArrayList<>();
}

