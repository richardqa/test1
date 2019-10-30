package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PlanResultadoExamenLaboratorio implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_resultado_examen_laboratorio;
	private String grupo_sanguineo;
	private String factor_rh;
	private String sensible;
	@JsonIgnore	
	private Integer id_episodio_atencion;
	
	public PlanResultadoExamenLaboratorio() {
		
	}

	public PlanResultadoExamenLaboratorio(Integer id_resultado_examen_laboratorio, String grupo_sanguineo,
			String factor_rh, String sensible, Integer id_episodio_atencion) {
	
		this.id_resultado_examen_laboratorio = id_resultado_examen_laboratorio;
		this.grupo_sanguineo = grupo_sanguineo;
		this.factor_rh = factor_rh;
		this.sensible = sensible;
		this.id_episodio_atencion = id_episodio_atencion;
	}

	public Integer getId_resultado_examen_laboratorio() {
		return id_resultado_examen_laboratorio;
	}

	public String getGrupo_sanguineo() {
		return grupo_sanguineo;
	}

	public String getFactor_rh() {
		return factor_rh;
	}

	public String getSensible() {
		return sensible;
	}

	public Integer getId_episodio_atencion() {
		return id_episodio_atencion;
	}

	public void setId_resultado_examen_laboratorio(Integer id_resultado_examen_laboratorio) {
		this.id_resultado_examen_laboratorio = id_resultado_examen_laboratorio;
	}

	public void setGrupo_sanguineo(String grupo_sanguineo) {
		this.grupo_sanguineo = grupo_sanguineo;
	}

	public void setFactor_rh(String factor_rh) {
		this.factor_rh = factor_rh;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	public void setId_episodio_atencion(Integer id_episodio_atencion) {
		this.id_episodio_atencion = id_episodio_atencion;
	}

	@Override
	public String toString() {
		return "PlanResultadoExamenLaboratorio [id_resultado_examen_laboratorio=" + id_resultado_examen_laboratorio
				+ ", grupo_sanguineo=" + grupo_sanguineo + ", factor_rh=" + factor_rh + ", sensible=" + sensible
				+ ", id_episodio_atencion=" + id_episodio_atencion + "]";
	}
	
}
