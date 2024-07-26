package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.TipoDoc;

import java.util.List;

public interface ITipoDocService {
    List<TipoDoc> listarTipo();

    TipoDoc guardarTipo(TipoDoc tipoDoc);

    TipoDoc obtenerTipo(Integer id);

}
