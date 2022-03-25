package proyectomodel.dao;

import proyectomodel.Estudianteproyecto;
import proyectomodel.util.Conexion;

public class EstudianteproyectoDao 
	extends Conexion<Estudianteproyecto> 
	implements GenericDao<Estudianteproyecto> {
	
	public EstudianteproyectoDao() {
		super(Estudianteproyecto.class);
	}
}
