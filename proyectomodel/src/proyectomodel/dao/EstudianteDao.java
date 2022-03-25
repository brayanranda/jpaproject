package proyectomodel.dao;

import proyectomodel.Estudiante;
import proyectomodel.util.Conexion;

public class EstudianteDao 
	extends Conexion<Estudiante> 
	implements GenericDao<Estudiante> {
	
	public EstudianteDao() {
		super(Estudiante.class);
	}
}
