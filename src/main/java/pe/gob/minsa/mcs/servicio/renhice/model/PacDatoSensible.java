package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PacDatoSensible implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_paciente;
	private String grupo_sanguineo;
	private String factor_rh;
	@JsonIgnore
	private Integer id_dato_sensible;
	
	public PacDatoSensible() {
		
	}

	public PacDatoSensible(Integer id_paciente, String grupo_sanguineo, String factor_rh, Integer id_dato_sensible) {
		
		this.id_paciente = id_paciente;
		this.grupo_sanguineo = grupo_sanguineo;
		this.factor_rh = factor_rh;
		this.id_dato_sensible = id_dato_sensible;
	}

	public Integer getId_paciente() {
		return id_paciente;
	}

	public String getGrupo_sanguineo() {
		return grupo_sanguineo;
	}

	public String getFactor_rh() {
		return factor_rh;
	}

	public Integer getId_dato_sensible() {
		return id_dato_sensible;
	}

	public void setId_paciente(Integer id_paciente) {
		this.id_paciente = id_paciente;
	}

	public void setGrupo_sanguineo(String grupo_sanguineo) {
		this.grupo_sanguineo = grupo_sanguineo;
	}

	public void setFactor_rh(String factor_rh) {
		this.factor_rh = factor_rh;
	}

	public void setId_dato_sensible(Integer id_dato_sensible) {
		this.id_dato_sensible = id_dato_sensible;
	}

	@Override
	public String toString() {
		return "PacDatoSensible [id_paciente=" + id_paciente + ", grupo_sanguineo=" + grupo_sanguineo + ", factor_rh="
				+ factor_rh + ", id_dato_sensible=" + id_dato_sensible + "]";
	}
	
}
