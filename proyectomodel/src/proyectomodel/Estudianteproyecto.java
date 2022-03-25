package proyectomodel;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the estudianteproyecto database table.
 * 
 */
@Entity
@NamedQuery(name="Estudianteproyecto.findAll", query="SELECT e FROM Estudianteproyecto e")
public class Estudianteproyecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String campo;

	//bi-directional many-to-one association to Estudiante
	@ManyToOne
	@JoinColumn(name="estudiante")
	private Estudiante estudianteBean;

	//bi-directional many-to-one association to Proyecto
	@ManyToOne
	@JoinColumn(name="proyecto")
	private Proyecto proyectoBean;

	public Estudianteproyecto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampo() {
		return this.campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public Estudiante getEstudianteBean() {
		return this.estudianteBean;
	}

	public void setEstudianteBean(Estudiante estudianteBean) {
		this.estudianteBean = estudianteBean;
	}

	public Proyecto getProyectoBean() {
		return this.proyectoBean;
	}

	public void setProyectoBean(Proyecto proyectoBean) {
		this.proyectoBean = proyectoBean;
	}

}