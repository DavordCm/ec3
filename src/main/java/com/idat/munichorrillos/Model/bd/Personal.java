package com.idat.munichorrillos.Model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "personal")
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPersonal;

    private String usuarioAcceso;
    private String contraseña;

    @ManyToOne
    @JoinColumn(name = "idEmpleado")
    private Empleado empleado;

    @OneToMany(mappedBy = "personal")
    private List<Multa> multas = new ArrayList<>();

    @OneToMany(mappedBy = "personal")
    private List<VMunicipal> vMunicipales = new ArrayList<>();
}
