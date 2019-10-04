package aate.gob.pe.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aate.gob.pe.model.Tipo;
import aate.gob.pe.repo.ITipoRepo;
import aate.gob.pe.service.ITipoService;

@Service
public class TipoServiceImpl implements ITipoService {

	@Autowired
	private ITipoRepo repo;
	
	@Override
	public Tipo registrar(Tipo t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tipo modificar(Tipo t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tipo> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Tipo leer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Tipo> listarPadre(Integer tippadcod) {
		return repo.listarPadre(tippadcod);
		
	}

}
