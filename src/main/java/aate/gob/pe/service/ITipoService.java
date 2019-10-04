package aate.gob.pe.service;

import java.util.List;

import aate.gob.pe.model.Tipo;

public interface ITipoService extends ICrud<Tipo> {
	
	List<Tipo>listarPadre(Integer tippadcod);

}
