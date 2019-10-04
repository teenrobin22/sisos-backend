package aate.gob.pe.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import aate.gob.pe.DTO.EstacionDTO;
import aate.gob.pe.model.Estacion;

public interface IEstacionService extends ICrud<Estacion> {
	List<Estacion>listarEstacion(Integer estcod);
	List<EstacionDTO>listarEstacionZonaDistrito( Integer estcod);
}
