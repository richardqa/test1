package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PlanMotivoContrareferencia implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_motivo_contrareferencia;
	private String id_contrareferencia;
	private String id_referencia;
	private String fg_autoreferido;
	private String fecha_contrareferencia;
	private String sensible;
	@JsonIgnore
	private Integer id_episodio_atencion;
	
	public PlanMotivoContrareferencia() {
		
	}

	public PlanMotivoContrareferencia(Integer id_motivo_contrareferencia, String id_contrareferencia,
			String id_referencia, String fg_autoreferido, String fecha_contrareferencia, String sensible,
			Integer id_episodio_atencion) {

		this.id_motivo_contrareferencia = id_motivo_contrareferencia;
		this.id_contrareferencia = id_contrareferencia;
		this.id_referencia = id_referencia;
		this.fg_autoreferido = fg_autoreferido;
		this.fecha_contrareferencia = fecha_contrareferencia;
		this.sensible = sensible;
		this.id_episodio_atencion = id_episodio_atencion;
	}

	public Integer getId_motivo_contrareferencia() {
		return id_motivo_contrareferencia;
	}

	public String getId_contrareferencia() {
		return id_contrareferencia;
	}

	public String getId_referencia() {
		return id_referencia;
	}

	public String getFg_autoreferido() {
		return fg_autoreferido;
	}

	public String getFecha_contrareferencia() {
		return fecha_contrareferencia;
	}

	public String getSensible() {
		return sensible;
	}

	public Integer getId_episodio_atencion() {
		return id_episodio_atencion;
	}

	public void setId_motivo_contrareferencia(Integer id_motivo_contrareferencia) {
		this.id_motivo_contrareferencia = id_motivo_contrareferencia;
	}

	public void setId_contrareferencia(String id_contrareferencia) {
		this.id_contrareferencia = id_contrareferencia;
	}

	public void setId_referencia(String id_referencia) {
		this.id_referencia = id_referencia;
	}

	public void setFg_autoreferido(String fg_autoreferido) {
		this.fg_autoreferido = fg_autoreferido;
	}

	public void setFecha_contrareferencia(String fecha_contrareferencia) {
		this.fecha_contrareferencia = fecha_contrareferencia;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	public void setId_episodio_atencion(Integer id_episodio_atencion) {
		this.id_episodio_atencion = id_episodio_atencion;
	}

	@Override
	public String toString() {
		return "PlanMotivoContrareferencia [id_motivo_contrareferencia=" + id_motivo_contrareferencia
				+ ", id_contrareferencia=" + id_contrareferencia + ", id_referencia=" + id_referencia
				+ ", fg_autoreferido=" + fg_autoreferido + ", fecha_contrareferencia=" + fecha_contrareferencia
				+ ", sensible=" + sensible + ", id_episodio_atencion=" + id_episodio_atencion + "]";
	}
	
}
