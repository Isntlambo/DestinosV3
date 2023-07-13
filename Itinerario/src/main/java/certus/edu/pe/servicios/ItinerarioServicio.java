package certus.edu.pe.servicios;

import java.util.List;

import certus.edu.pe.modelo.Itinerario;


public interface ItinerarioServicio {
	public List<Itinerario> listarItinerario();
	
	public Itinerario crearItinerario(Itinerario itinerario);
	
	public Itinerario editarItinerario(Itinerario itinerario);
	
	public Itinerario buscarItinerario(int Id_Itinerario);
	
	public void eliminarItinerario(int Id_Itinerario);
	
	
}


