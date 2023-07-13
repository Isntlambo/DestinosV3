package destinos.edu.pe.servicios.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import destinos.edu.pe.modelo.Origen;
import destinos.edu.pe.repositorio.OrigenRepositorio;
import destinos.edu.pe.servicios.OrigenServicios;

@Service
public class OrigenServiceImp implements OrigenServicios{

	@Autowired
	private OrigenRepositorio repositorio;
	
	@Override
	public List<Origen> listarOrigen() {

		return (List<Origen>) repositorio.findAll();
	}

	@Override
	public Origen crearOrigen(Origen origen) {
		origen.setId_Origen(origen.getId_Origen());
		return repositorio.save(origen);
	}

	@Override
	public Origen editarOrigen(Origen origen) {
		
		return repositorio.save(origen);
	}

	@Override
	public Origen buscarOrigen(int Id_Origen) {
		
		return repositorio.findById(Id_Origen).get();
	}

	@Override
	public void eliminarOrigen(int Id_Origen) {
		repositorio.deleteById(Id_Origen);
		
	}
	


}
