package proyectomodel.dao;

import proyectomodel.Juradoanteproyecto;
import proyectomodel.util.Conexion;

public class JuradoanteproyectoDao 
	extends Conexion<Juradoanteproyecto> 
	implements GenericDao<Juradoanteproyecto> {
	
	public JuradoanteproyectoDao() {
		super(Juradoanteproyecto.class);
	}
}
