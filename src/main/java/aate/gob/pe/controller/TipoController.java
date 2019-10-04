package aate.gob.pe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aate.gob.pe.exception.ModeloNotFoundException;
import aate.gob.pe.model.Tipo;
import aate.gob.pe.service.ITipoService;


@RestController
@RequestMapping("/tipos")
public class TipoController {
	
	@Autowired
	private ITipoService service;
	
	@GetMapping("/listarPadre/{id}")
	public ResponseEntity<List<Tipo>> listarPadre(@PathVariable("id") Integer id)
	{
		List<Tipo> lTipo= service.listarPadre(id);
		if(lTipo ==null)
		{
			throw new ModeloNotFoundException("No se encontraron registros.");
		}
		return new ResponseEntity<List<Tipo>>(lTipo, HttpStatus.OK);
	}
	
	@GetMapping
	public List<Tipo> listar(){
		return service.listar();
	}

}
