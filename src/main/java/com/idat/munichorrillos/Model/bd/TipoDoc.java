package com.idat.munichorrillos.Model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tipodoc")
public class TipoDoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdTipoDoc;
    private String Descripcion;
    private Integer Num_Identifica;

    }
