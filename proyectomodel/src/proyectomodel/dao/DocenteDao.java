package proyectomodel.dao;

import proyectomodel.Docente;
import proyectomodel.util.Conexion;

public class DocenteDao 
	extends Conexion<Docente> 
	implements GenericDao<Docente> {
	
	public DocenteDao() {
		super(Docente.class);
	}
}