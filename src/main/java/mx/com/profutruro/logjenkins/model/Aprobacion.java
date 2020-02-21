package mx.com.profutruro.logjenkins.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aprobacion {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="aprobacionSeq")
	private Long id;
	private long gitId;
	private Date fecha;
	private String origenEjecucion;
	private String tipoAprobacion;
	private String comentario;

	public long getGitId() {
		return gitId;
	}

	public void setGitId(long gitId) {
		this.gitId = gitId;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getOrigenEjecucion() {
		return origenEjecucion;
	}

	public void setOrigenEjecucion(String origenEjecucion) {
		this.origenEjecucion = origenEjecucion;
	}

	public String getTipoAprobacion() {
		return tipoAprobacion;
	}

	public void setTipoAprobacion(String tipoAprobacion) {
		this.tipoAprobacion = tipoAprobacion;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Long getId() {
		return id;
	}

	public Aprobacion(Long id, long gitId, Date fecha, String origenEjecucion, String tipoAprobacion,
			String comentario) {
		super();
		this.id = id;
		this.gitId = gitId;
		this.fecha = fecha;
		this.origenEjecucion = origenEjecucion;
		this.tipoAprobacion = tipoAprobacion;
		this.comentario = comentario;
	}

}
