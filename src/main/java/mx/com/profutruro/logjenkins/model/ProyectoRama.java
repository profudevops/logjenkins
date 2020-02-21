package mx.com.profutruro.logjenkins.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProyectoRama {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="proyectoRamaseq")
	private long id;
	private String proyectoClave;
	private String develop;
	private String qa;
	private String devsecops;
	private String master;

	public String getProyectoClave() {
		return proyectoClave;
	}

	public void setProyectoClave(String proyectoClave) {
		this.proyectoClave = proyectoClave;
	}

	public String getDevelop() {
		return develop;
	}

	public void setDevelop(String develop) {
		this.develop = develop;
	}

	public String getQa() {
		return qa;
	}

	public void setQa(String qa) {
		this.qa = qa;
	}

	public String getDevsecops() {
		return devsecops;
	}

	public void setDevsecops(String devsecops) {
		this.devsecops = devsecops;
	}

	public String getMaster() {
		return master;
	}

	public void setMaster(String master) {
		this.master = master;
	}

	public long getId() {
		return id;
	}

	public ProyectoRama(long id, String proyectoClave, String develop, String qa, String devsecops, String master) {
		super();
		this.id = id;
		this.proyectoClave = proyectoClave;
		this.develop = develop;
		this.qa = qa;
		this.devsecops = devsecops;
		this.master = master;
	}

}
