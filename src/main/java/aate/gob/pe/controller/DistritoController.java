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
import aate.gob.pe.model.Distrito;
import aate.gob.pe.model.Estacion;
import aate.gob.pe.service.IDistritoService;

@RestController
@RequestMapping("/distritos")
public class DistritoController {

	@Autowired
	private IDistritoService service;
	
	@GetMapping("/listar/{id}")
	public ResponseEntity<List<Distrito>> listar(@PathVariable("id") Integer id)
	{
		List<Distrito> lDistrito= service.listarDistrito(id);
		if(lDistrito ==null)
		{
			throw new ModeloNotFoundException("No se encontraron registros.");
		}
		return new ResponseEntity<List<Distrito>>(lDistrito, HttpStatus.OK);
	}
	
}
