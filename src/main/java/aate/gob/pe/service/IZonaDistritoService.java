package aate.gob.pe.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import aate.gob.pe.model.Tipo;
import aate.gob.pe.model.ZonaDistrito;

public interface IZonaDistritoService extends ICrud<ZonaDistrito> {
	List<Tipo>listarZonaxDistrito(@Param("discod") Integer discod);
}
