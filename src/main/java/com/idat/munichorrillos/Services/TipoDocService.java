package com.idat.munichorrillos.Services;

import com.idat.munichorrillos.Model.bd.TipoDoc;
import com.idat.munichorrillos.Repository.TipoDocRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class TipoDocService implements ITipoDocService{
    @Autowired
    private TipoDocRepository tipoDocRepository;
    @Override
    public List<TipoDoc> listarTipo() {
        return tipoDocRepository.findAll();
    }

    @Override
    public TipoDoc guardarTipo(TipoDoc tipoDoc) {
        return tipoDocRepository.save(tipoDoc);
    }

    @Override
    public TipoDoc obtenerTipo(Integer id) {
        return tipoDocRepository.findById(id).orElse(null);
    }
}
