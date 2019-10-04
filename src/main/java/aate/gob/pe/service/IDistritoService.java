package aate.gob.pe.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import aate.gob.pe.model.Distrito;
import aate.gob.pe.model.Estacion;

public interface IDistritoService extends ICrud<Distrito> {
	List<Distrito>listarDistrito(@Param("discod") Integer discod);
}
