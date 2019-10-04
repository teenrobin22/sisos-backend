package aate.gob.pe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aate.gob.pe.DTO.EstacionDTO;
import aate.gob.pe.exception.ModeloNotFoundException;
import aate.gob.pe.model.Estacion;
import aate.gob.pe.service.IEstacionService;

@RestController
@RequestMapping("/estaciones")
public class EstacionController {

	@Autowired
	private IEstacionService service;
	
	@GetMapping("/listar/{id}")
	public ResponseEntity<List<Estacion>> listar(@PathVariable("id") Integer id)
	{
		List<Estacion> lEstacion= service.listarEstacion(id);
		if(lEstacion ==null)
		{
			throw new ModeloNotFoundException("No se encontraron registros.");
		}
		return new ResponseEntity<List<Estacion>>(lEstacion, HttpStatus.OK);
	}
	
	@GetMapping("/lestacion/{id}")
	public ResponseEntity<List<EstacionDTO>> lestacion(@PathVariable("id") Integer id)
	{
		List<EstacionDTO> lEstacion= service.listarEstacionZonaDistrito(id);
		if(lEstacion ==null)
		{
			throw new ModeloNotFoundException("No se encontraron registros.");
		}
		return new ResponseEntity<List<EstacionDTO>>(lEstacion, HttpStatus.OK);
	}
}
