package com.idat.munichorrillos.Repository;

import com.idat.munichorrillos.Model.bd.TipoDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDocRepository extends JpaRepository<TipoDoc,Integer> {
}
