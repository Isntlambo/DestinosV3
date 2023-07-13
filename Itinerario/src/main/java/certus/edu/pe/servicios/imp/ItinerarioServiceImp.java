package certus.edu.pe.servicios.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import certus.edu.pe.modelo.Itinerario;
import certus.edu.pe.repositorio.ItinerarioRepositorio;
import certus.edu.pe.servicios.ItinerarioServicio;

@Service
public class ItinerarioServiceImp implements ItinerarioServicio{
	
	@Autowired
	private ItinerarioRepositorio repositorio;
	
	@Override
	public List<Itinerario> listarItinerario() {

		return (List<Itinerario>) repositorio.findAll();
	}

	@Override
	public Itinerario crearItinerario(Itinerario itinerario) {
		itinerario.setId_Itinerario(itinerario.getId_Itinerario());
		return repositorio.save(itinerario);
	}

	@Override
	public Itinerario editarItinerario(Itinerario itinerario) {
		
		return repositorio.save(itinerario);
	}

	@Override
	public Itinerario buscarItinerario(int Id_Itinerario) {
		
		return repositorio.findById(Id_Itinerario).get();
	}

	@Override
	public void eliminarItinerario(int Id_Itinerario) {
		repositorio.deleteById(Id_Itinerario);
		
	}
	
}
