package proyectomodel;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the juradoproyecto database table.
 * 
 */
@Entity
@NamedQuery(name="Juradoproyecto.findAll", query="SELECT j FROM Juradoproyecto j")
public class Juradoproyecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.DATE)
	private Date fechaasignacion;

	@Temporal(TemporalType.DATE)
	private Date fechanota;

	private double nota;

	private String observacion;

	//bi-directional many-to-one association to Docente
	@ManyToOne
	@JoinColumn(name="docente")
	private Docente docenteBean;

	//bi-directional many-to-one association to Proyecto
	@ManyToOne
	@JoinColumn(name="proyecto")
	private Proyecto proyectoBean;

	public Juradoproyecto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaasignacion() {
		return this.fechaasignacion;
	}

	public void setFechaasignacion(Date fechaasignacion) {
		this.fechaasignacion = fechaasignacion;
	}

	public Date getFechanota() {
		return this.fechanota;
	}

	public void setFechanota(Date fechanota) {
		this.fechanota = fechanota;
	}

	public double getNota() {
		return this.nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Docente getDocenteBean() {
		return this.docenteBean;
	}

	public void setDocenteBean(Docente docenteBean) {
		this.docenteBean = docenteBean;
	}

	public Proyecto getProyectoBean() {
		return this.proyectoBean;
	}

	public void setProyectoBean(Proyecto proyectoBean) {
		this.proyectoBean = proyectoBean;
	}

}