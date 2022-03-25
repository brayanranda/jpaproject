package proyectomodel.dao;

import proyectomodel.Carrera;
import proyectomodel.util.Conexion;

public class CarreraDao 
	extends Conexion<Carrera> 
	implements GenericDao<Carrera> {
	
	public CarreraDao() {
		super(Carrera.class);
	}
}