package proyectomodel.dao;

import proyectomodel.Tipoasesor;
import proyectomodel.util.Conexion;

public class TipoasesorDao 
	extends Conexion<Tipoasesor> 
	implements GenericDao<Tipoasesor> {
	
	public TipoasesorDao() {
		super(Tipoasesor.class);
	}
}
