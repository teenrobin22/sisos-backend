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
import aate.gob.pe.service.IZonaDistritoService;

@RestController
@RequestMapping("/zonasdistritos")
public class ZonaDistritoController {
	@Autowired
	private IZonaDistritoService service;
	
	@GetMapping("/listar/{id}")
	public ResponseEntity<List<Tipo>> listar(@PathVariable("id") Integer id)
	{
		List<Tipo> lZona= service.listarZonaxDistrito(id);
		if(lZona ==null)
		{
			throw new ModeloNotFoundException("No se encontraron registros.");
		}
		return new ResponseEntity<List<Tipo>>(lZona, HttpStatus.OK);
	}
}
