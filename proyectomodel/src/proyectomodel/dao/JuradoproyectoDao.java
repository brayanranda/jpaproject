package proyectomodel.dao;

import proyectomodel.Juradoproyecto;
import proyectomodel.util.Conexion;

public class JuradoproyectoDao 
	extends Conexion<Juradoproyecto> 
	implements GenericDao<Juradoproyecto> {
	
	public JuradoproyectoDao() {
		super(Juradoproyecto.class);
	}
}
