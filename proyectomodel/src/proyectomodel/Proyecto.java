package proyectomodel;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the proyecto database table.
 * 
 */
@Entity
@NamedQuery(name="Proyecto.findAll", query="SELECT p FROM Proyecto p")
public class Proyecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.DATE)
	private Date fechaanteproyecto;

	@Temporal(TemporalType.DATE)
	private Date fechainicio;

	@Temporal(TemporalType.DATE)
	private Date fechaproyecto;

	private String resumen;

	private String titulo;

	//bi-directional many-to-one association to Asesor
	@OneToMany(mappedBy="proyectoBean")
	private List<Asesor> asesors;

	//bi-directional many-to-one association to Estudianteproyecto
	@OneToMany(mappedBy="proyectoBean")
	private List<Estudianteproyecto> estudianteproyectos;

	//bi-directional many-to-one association to Juradoanteproyecto
	@OneToMany(mappedBy="proyectoBean")
	private List<Juradoanteproyecto> juradoanteproyectos;

	//bi-directional many-to-one association to Juradoproyecto
	@OneToMany(mappedBy="proyectoBean")
	private List<Juradoproyecto> juradoproyectos;

	//bi-directional many-to-one association to Docente
	@ManyToOne
	@JoinColumn(name="director")
	private Docente docente;

	public Proyecto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaanteproyecto() {
		return this.fechaanteproyecto;
	}

	public void setFechaanteproyecto(Date fechaanteproyecto) {
		this.fechaanteproyecto = fechaanteproyecto;
	}

	public Date getFechainicio() {
		return this.fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	public Date getFechaproyecto() {
		return this.fechaproyecto;
	}

	public void setFechaproyecto(Date fechaproyecto) {
		this.fechaproyecto = fechaproyecto;
	}

	public Object getResumen() {
		return this.resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Asesor> getAsesors() {
		return this.asesors;
	}

	public void setAsesors(List<Asesor> asesors) {
		this.asesors = asesors;
	}

	public Asesor addAsesor(Asesor asesor) {
		getAsesors().add(asesor);
		asesor.setProyectoBean(this);

		return asesor;
	}

	public Asesor removeAsesor(Asesor asesor) {
		getAsesors().remove(asesor);
		asesor.setProyectoBean(null);

		return asesor;
	}

	public List<Estudianteproyecto> getEstudianteproyectos() {
		return this.estudianteproyectos;
	}

	public void setEstudianteproyectos(List<Estudianteproyecto> estudianteproyectos) {
		this.estudianteproyectos = estudianteproyectos;
	}

	public Estudianteproyecto addEstudianteproyecto(Estudianteproyecto estudianteproyecto) {
		getEstudianteproyectos().add(estudianteproyecto);
		estudianteproyecto.setProyectoBean(this);

		return estudianteproyecto;
	}

	public Estudianteproyecto removeEstudianteproyecto(Estudianteproyecto estudianteproyecto) {
		getEstudianteproyectos().remove(estudianteproyecto);
		estudianteproyecto.setProyectoBean(null);

		return estudianteproyecto;
	}

	public List<Juradoanteproyecto> getJuradoanteproyectos() {
		return this.juradoanteproyectos;
	}

	public void setJuradoanteproyectos(List<Juradoanteproyecto> juradoanteproyectos) {
		this.juradoanteproyectos = juradoanteproyectos;
	}

	public Juradoanteproyecto addJuradoanteproyecto(Juradoanteproyecto juradoanteproyecto) {
		getJuradoanteproyectos().add(juradoanteproyecto);
		juradoanteproyecto.setProyectoBean(this);

		return juradoanteproyecto;
	}

	public Juradoanteproyecto removeJuradoanteproyecto(Juradoanteproyecto juradoanteproyecto) {
		getJuradoanteproyectos().remove(juradoanteproyecto);
		juradoanteproyecto.setProyectoBean(null);

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
		juradoproyecto.setProyectoBean(this);

		return juradoproyecto;
	}

	public Juradoproyecto removeJuradoproyecto(Juradoproyecto juradoproyecto) {
		getJuradoproyectos().remove(juradoproyecto);
		juradoproyecto.setProyectoBean(null);

		return juradoproyecto;
	}

	public Docente getDocente() {
		return this.docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

}