package destinos.edu.pe.servicios;
import java.util.List;
import destinos.edu.pe.modelo.Origen;

public interface OrigenServicios {
	
	public List<Origen> listarOrigen();
	
	public Origen crearOrigen(Origen origen);
	
	public Origen editarOrigen(Origen origen);
	
	public Origen buscarOrigen(int Id_Origen);
	
	public void eliminarOrigen(int Id_Origen);
	
	
}
