package proyectomodel;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the asesor database table.
 * 
 */
@Entity
@NamedQuery(name="Asesor.findAll", query="SELECT a FROM Asesor a")
public class Asesor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	//bi-directional many-to-one association to Docente
	@ManyToOne
	@JoinColumn(name="docente")
	private Docente docenteBean;

	//bi-directional many-to-one association to Proyecto
	@ManyToOne
	@JoinColumn(name="proyecto")
	private Proyecto proyectoBean;

	//bi-directional many-to-one association to Tipoasesor
	@ManyToOne
	@JoinColumn(name="tipo")
	private Tipoasesor tipoasesor;

	public Asesor() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Tipoasesor getTipoasesor() {
		return this.tipoasesor;
	}

	public void setTipoasesor(Tipoasesor tipoasesor) {
		this.tipoasesor = tipoasesor;
	}

}