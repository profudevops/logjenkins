package mx.com.profutruro.logjenkins.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GitFlow {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="gitFlowSeq")
	private Long id;
	private Date fecha;
	private String repositorio;
	private String ejecutor;
	private String disparador;
	private int disparadorNumero;
	private String ramaOrigen;
	private String ramaDestino;
	private String pipelineEjecutor;
	private String pipelineEjecucionNumero;
	private String aprobador;
	
	
	public Long getId() {
		return id;
	}
	/*
	public void setId(Long id) {
		this.id = id;
	}*/
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getRepositorio() {
		return repositorio;
	}
	public void setRepositorio(String repositorio) {
		this.repositorio = repositorio;
	}
	public String getEjecutor() {
		return ejecutor;
	}
	public void setEjecutor(String ejecutor) {
		this.ejecutor = ejecutor;
	}
	public String getDisparador() {
		return disparador;
	}
	public void setDisparador(String disparador) {
		this.disparador = disparador;
	}
	public int getDisparadorNumero() {
		return disparadorNumero;
	}
	public void setDisparadorNumero(int disparadorNumero) {
		this.disparadorNumero = disparadorNumero;
	}
	public String getRamaOrigen() {
		return ramaOrigen;
	}
	public void setRamaOrigen(String ramaOrigen) {
		this.ramaOrigen = ramaOrigen;
	}
	public String getRamaDestino() {
		return ramaDestino;
	}
	public void setRamaDestino(String ramaDestino) {
		this.ramaDestino = ramaDestino;
	}
	public String getPipelineEjecutor() {
		return pipelineEjecutor;
	}
	public void setPipelineEjecutor(String pipelineEjecutor) {
		this.pipelineEjecutor = pipelineEjecutor;
	}
	public String getPipelineEjecucionNumero() {
		return pipelineEjecucionNumero;
	}
	public void setPipelineEjecucionNumero(String pipelineEjecucionNumero) {
		this.pipelineEjecucionNumero = pipelineEjecucionNumero;
	}
	public String getAprobador() {
		return aprobador;
	}
	public void setAprobador(String aprobador) {
		this.aprobador = aprobador;
	}
	public GitFlow(Long id, Date fecha, String repositorio, String ejecutor, String disparador, int disparadorNumero,
			String ramaOrigen, String ramaDestino, String pipelineEjecutor, String pipelineEjecucionNumero,
			String aprobador) {
		super();
		//this.id = id;
		this.fecha = fecha;
		this.repositorio = repositorio;
		this.ejecutor = ejecutor;
		this.disparador = disparador;
		this.disparadorNumero = disparadorNumero;
		this.ramaOrigen = ramaOrigen;
		this.ramaDestino = ramaDestino;
		this.pipelineEjecutor = pipelineEjecutor;
		this.pipelineEjecucionNumero = pipelineEjecucionNumero;
		this.aprobador = aprobador;
	}


	
	
}
