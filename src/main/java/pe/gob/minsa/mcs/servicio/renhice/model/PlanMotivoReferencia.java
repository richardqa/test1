package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PlanMotivoReferencia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_motivo_referencia;
	private String id_referencia;
	private String motivo;
	private String fecha_referencia;
	private String sensible;
	@JsonIgnore
	private Integer id_episodio_atencion;
	
	public PlanMotivoReferencia() {
		
	}

	public PlanMotivoReferencia(Integer id_motivo_referencia, String id_referencia, String motivo,
			String fecha_referencia, String sensible, Integer id_episodio_atencion) {

		this.id_motivo_referencia = id_motivo_referencia;
		this.id_referencia = id_referencia;
		this.motivo = motivo;
		this.fecha_referencia = fecha_referencia;
		this.sensible = sensible;
		this.id_episodio_atencion = id_episodio_atencion;
	}

	public Integer getId_motivo_referencia() {
		return id_motivo_referencia;
	}

	public String getId_referencia() {
		return id_referencia;
	}

	public String getMotivo() {
		return motivo;
	}

	public String getFecha_referencia() {
		return fecha_referencia;
	}

	public String getSensible() {
		return sensible;
	}

	public Integer getId_episodio_atencion() {
		return id_episodio_atencion;
	}

	public void setId_motivo_referencia(Integer id_motivo_referencia) {
		this.id_motivo_referencia = id_motivo_referencia;
	}

	public void setId_referencia(String id_referencia) {
		this.id_referencia = id_referencia;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public void setFecha_referencia(String fecha_referencia) {
		this.fecha_referencia = fecha_referencia;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	public void setId_episodio_atencion(Integer id_episodio_atencion) {
		this.id_episodio_atencion = id_episodio_atencion;
	}

	@Override
	public String toString() {
		return "PlanMotivoReferencia [id_motivo_referencia=" + id_motivo_referencia + ", id_referencia=" + id_referencia
				+ ", motivo=" + motivo + ", fecha_referencia=" + fecha_referencia + ", sensible=" + sensible
				+ ", id_episodio_atencion=" + id_episodio_atencion + "]";
	}
	
}
