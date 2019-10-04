package aate.gob.pe.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aate.gob.pe.model.Tipo;
import aate.gob.pe.model.ZonaDistrito;
import aate.gob.pe.repo.IZonaDistritoRepo;
import aate.gob.pe.service.IZonaDistritoService;
@Service
public class ZonaDistritoServiceImpl implements IZonaDistritoService {

	@Autowired
	private IZonaDistritoRepo repo;
	
	
	@Override
	public ZonaDistrito registrar(ZonaDistrito t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ZonaDistrito modificar(ZonaDistrito t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ZonaDistrito> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ZonaDistrito leer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Tipo> listarZonaxDistrito(Integer discod) {
		return repo.listarZonaxDistrito(discod);
	}

}
