package proyectomodel.dao;

import proyectomodel.Asesor;
import proyectomodel.util.Conexion;

public class AsesorDao 
	extends Conexion<Asesor> 
	implements GenericDao<Asesor> {
	
	public AsesorDao() {
		super(Asesor.class);
	}
}