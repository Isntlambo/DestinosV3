package destinos.edu.pe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import destinos.edu.pe.modelo.Origen;
import destinos.edu.pe.servicios.imp.OrigenServiceImp;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class OrigenController {
	@Autowired
	private OrigenServiceImp service;
	
	@GetMapping("api/origen")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> listarOrigen(){
		List<Origen> listarOrigen=service.listarOrigen();
		return ResponseEntity.ok(listarOrigen);
	}
	
	@PostMapping("api/origen")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> crearOrigen(@RequestBody Origen origen){
		Origen origenCreado=service.crearOrigen(origen);
		return ResponseEntity.status(HttpStatus.CREATED).body(origenCreado);
	}

	@PutMapping("api/origen")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> editarOrigen(@RequestBody Origen origen){
		Origen editarOrigen=service.editarOrigen(origen);
		return ResponseEntity.status(HttpStatus.CREATED).body(editarOrigen);
	}
	@GetMapping("api/origen/{id_Origen}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?>buscarOrigen(@PathVariable int Id_Origen){
		Origen origen=service.buscarOrigen(Id_Origen);
		return ResponseEntity.ok(origen);
	}
	
	@DeleteMapping("api/origen/{id_Origen}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> eliminarOrigen(@PathVariable int Id_Origen){
		service.eliminarOrigen(Id_Origen);
		return ResponseEntity.ok().build();
	}
}
