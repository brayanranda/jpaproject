package proyectomodel;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the estudiante database table.
 * 
 */
@Entity
@NamedQuery(name="Estudiante.findAll", query="SELECT e FROM Estudiante e")
public class Estudiante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String codigo;

	private String apeliido;

	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	private String genero;

	private String nombre;

	//bi-directional many-to-one association to Carrera
	@ManyToOne
	@JoinColumn(name="carrera")
	private Carrera carreraBean;

	//bi-directional many-to-one association to Estudianteproyecto
	@OneToMany(mappedBy="estudianteBean")
	private List<Estudianteproyecto> estudianteproyectos;

	public Estudiante() {
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getApeliido() {
		return this.apeliido;
	}

	public void setApeliido(String apeliido) {
		this.apeliido = apeliido;
	}

	public Date getFechanacimiento() {
		return this.fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carrera getCarreraBean() {
		return this.carreraBean;
	}

	public void setCarreraBean(Carrera carreraBean) {
		this.carreraBean = carreraBean;
	}

	public List<Estudianteproyecto> getEstudianteproyectos() {
		return this.estudianteproyectos;
	}

	public void setEstudianteproyectos(List<Estudianteproyecto> estudianteproyectos) {
		this.estudianteproyectos = estudianteproyectos;
	}

	public Estudianteproyecto addEstudianteproyecto(Estudianteproyecto estudianteproyecto) {
		getEstudianteproyectos().add(estudianteproyecto);
		estudianteproyecto.setEstudianteBean(this);

		return estudianteproyecto;
	}

	public Estudianteproyecto removeEstudianteproyecto(Estudianteproyecto estudianteproyecto) {
		getEstudianteproyectos().remove(estudianteproyecto);
		estudianteproyecto.setEstudianteBean(null);

		return estudianteproyecto;
	}

}