package aate.gob.pe.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aate.gob.pe.DTO.EstacionDTO;
import aate.gob.pe.model.Estacion;
import aate.gob.pe.repo.IEstacionRepo;
import aate.gob.pe.service.IEstacionService;

@Service
public class EstacionServiceImpl implements IEstacionService {

	@Autowired
	private IEstacionRepo repo;
	
	@Override
	public Estacion registrar(Estacion t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estacion modificar(Estacion t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estacion> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estacion leer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Estacion> listarEstacion(Integer estcod) {
		return repo.listarEstacion(estcod);
	}

	@Override
	public List<EstacionDTO> listarEstacionZonaDistrito(Integer estcod) {
		return repo.listarEstacionZonaDistrito(estcod);
	}

	

}
