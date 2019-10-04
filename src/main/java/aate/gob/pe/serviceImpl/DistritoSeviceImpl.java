package aate.gob.pe.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aate.gob.pe.model.Distrito;
import aate.gob.pe.model.Estacion;
import aate.gob.pe.repo.IDistritoRepo;
import aate.gob.pe.service.IDistritoService;

@Service
public class DistritoSeviceImpl implements IDistritoService {

	@Autowired
	private IDistritoRepo repo;

	@Override
	public Distrito registrar(Distrito t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Distrito modificar(Distrito t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Distrito> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Distrito leer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Distrito> listarDistrito(Integer discod) {
		return repo.listarDistrito(discod);
	}

}
