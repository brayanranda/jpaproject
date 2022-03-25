package proyectomodel;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the docente database table.
 * 
 */
@Entity
@NamedQuery(name="Docente.findAll", query="SELECT d FROM Docente d")
public class Docente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codigo;

	private String apellido;

	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	private String genero;

	private String nombre;

	//bi-directional many-to-one association to Asesor
	@OneToMany(mappedBy="docenteBean")
	private List<Asesor> asesors;

	//bi-directional many-to-one association to Carrera
	@ManyToOne
	@JoinColumn(name="carrera")
	private Carrera carreraBean;

	//bi-directional many-to-one association to Juradoanteproyecto
	@OneToMany(mappedBy="docenteBean")
	private List<Juradoanteproyecto> juradoanteproyectos;

	//bi-directional many-to-one association to Juradoproyecto
	@OneToMany(mappedBy="docenteBean")
	private List<Juradoproyecto> juradoproyectos;

	//bi-directional many-to-one association to Proyecto
	@OneToMany(mappedBy="docente")
	private List<Proyecto> proyectos;

	public Docente() {
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public List<Asesor> getAsesors() {
		return this.asesors;
	}

	public void setAsesors(List<Asesor> asesors) {
		this.asesors = asesors;
	}

	public Asesor addAsesor(Asesor asesor) {
		getAsesors().add(asesor);
		asesor.setDocenteBean(this);

		return asesor;
	}

	public Asesor removeAsesor(Asesor asesor) {
		getAsesors().remove(asesor);
		asesor.setDocenteBean(null);

		return asesor;
	}

	public Carrera getCarreraBean() {
		return this.carreraBean;
	}

	public void setCarreraBean(Carrera carreraBean) {
		this.carreraBean = carreraBean;
	}

	public List<Juradoanteproyecto> getJuradoanteproyectos() {
		return this.juradoanteproyectos;
	}

	public void setJuradoanteproyectos(List<Juradoanteproyecto> juradoanteproyectos) {
		this.juradoanteproyectos = juradoanteproyectos;
	}

	public Juradoanteproyecto addJuradoanteproyecto(Juradoanteproyecto juradoanteproyecto) {
		getJuradoanteproyectos().add(juradoanteproyecto);
		juradoanteproyecto.setDocenteBean(this);

		return juradoanteproyecto;
	}

	public Juradoanteproyecto removeJuradoanteproyecto(Juradoanteproyecto juradoanteproyecto) {
		getJuradoanteproyectos().remove(juradoanteproyecto);
		juradoanteproyecto.setDocenteBean(null);

		return juradoanteproyecto;
	}

	public List<Juradoproyecto> getJuradoproyectos() {
		return this.juradoproyectos;
	}

	public void setJuradoproyectos(List<Juradoproyecto> juradoproyectos) {
		this.juradoproyectos = juradoproyectos;
	}

	public Juradoproyecto addJuradoproyecto(Juradoproyecto juradoproyecto) {
		getJuradoproyectos().add(juradoproyecto);
		juradoproyecto.setDocenteBean(this);

		return juradoproyecto;
	}

	public Juradoproyecto removeJuradoproyecto(Juradoproyecto juradoproyecto) {
		getJuradoproyectos().remove(juradoproyecto);
		juradoproyecto.setDocenteBean(null);

		return juradoproyecto;
	}

	public List<Proyecto> getProyectos() {
		return this.proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	public Proyecto addProyecto(Proyecto proyecto) {
		getProyectos().add(proyecto);
		proyecto.setDocente(this);

		return proyecto;
	}

	public Proyecto removeProyecto(Proyecto proyecto) {
		getProyectos().remove(proyecto);
		proyecto.setDocente(null);

		return proyecto;
	}

}