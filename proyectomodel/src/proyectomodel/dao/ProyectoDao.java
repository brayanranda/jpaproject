package proyectomodel.dao;

import proyectomodel.Proyecto;
import proyectomodel.util.Conexion;

public class ProyectoDao 
	extends Conexion<Proyecto> 
	implements GenericDao<Proyecto> {
	
	public ProyectoDao() {
		super(Proyecto.class);
	}
}
