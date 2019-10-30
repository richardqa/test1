package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PlanMotivoTelemedicina implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_motivo_telemedicina;
	private String id_teleconsulta;
	private String motivo;
	private String fecha_teleconsulta;
	private String sensible;
	@JsonIgnore
	private Integer id_episodio_atencion;
	
	public PlanMotivoTelemedicina() {
		
	}

	public PlanMotivoTelemedicina(Integer id_motivo_telemedicina, String id_teleconsulta, String motivo,
			String fecha_teleconsulta, String sensible, Integer id_episodio_atencion) {
	
		this.id_motivo_telemedicina = id_motivo_telemedicina;
		this.id_teleconsulta = id_teleconsulta;
		this.motivo = motivo;
		this.fecha_teleconsulta = fecha_teleconsulta;
		this.sensible = sensible;
		this.id_episodio_atencion = id_episodio_atencion;
	}

	public Integer getId_motivo_telemedicina() {
		return id_motivo_telemedicina;
	}

	public String getId_teleconsulta() {
		return id_teleconsulta;
	}

	public String getMotivo() {
		return motivo;
	}

	public String getFecha_teleconsulta() {
		return fecha_teleconsulta;
	}

	public String getSensible() {
		return sensible;
	}

	public Integer getId_episodio_atencion() {
		return id_episodio_atencion;
	}

	public void setId_motivo_telemedicina(Integer id_motivo_telemedicina) {
		this.id_motivo_telemedicina = id_motivo_telemedicina;
	}

	public void setId_teleconsulta(String id_teleconsulta) {
		this.id_teleconsulta = id_teleconsulta;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public void setFecha_teleconsulta(String fecha_teleconsulta) {
		this.fecha_teleconsulta = fecha_teleconsulta;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	public void setId_episodio_atencion(Integer id_episodio_atencion) {
		this.id_episodio_atencion = id_episodio_atencion;
	}

	@Override
	public String toString() {
		return "PlanMotivoTelemedicina [id_motivo_telemedicina=" + id_motivo_telemedicina + ", id_teleconsulta="
				+ id_teleconsulta + ", motivo=" + motivo + ", fecha_teleconsulta=" + fecha_teleconsulta + ", sensible="
				+ sensible + ", id_episodio_atencion=" + id_episodio_atencion + "]";
	}	
	
}
