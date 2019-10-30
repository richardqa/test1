package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class IndAltaDiagEgreso implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_ind_alta;
	private String codigo;
	private String tipo_diagnostico;
	private String sensible;
	@JsonIgnore
	private Integer id_diagnostico_egreso;
	
	public IndAltaDiagEgreso() {
		
	}

	public IndAltaDiagEgreso(Integer id_ind_alta, String codigo, String tipo_diagnostico, String sensible,
			Integer id_diagnostico_egreso) {
		
		this.id_ind_alta = id_ind_alta;
		this.codigo = codigo;
		this.tipo_diagnostico = tipo_diagnostico;
		this.sensible = sensible;
		this.id_diagnostico_egreso = id_diagnostico_egreso;
	}

	public Integer getId_ind_alta() {
		return id_ind_alta;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTipo_diagnostico() {
		return tipo_diagnostico;
	}

	public String getSensible() {
		return sensible;
	}

	public Integer getId_diagnostico_egreso() {
		return id_diagnostico_egreso;
	}

	public void setId_ind_alta(Integer id_ind_alta) {
		this.id_ind_alta = id_ind_alta;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setTipo_diagnostico(String tipo_diagnostico) {
		this.tipo_diagnostico = tipo_diagnostico;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	public void setId_diagnostico_egreso(Integer id_diagnostico_egreso) {
		this.id_diagnostico_egreso = id_diagnostico_egreso;
	}

	@Override
	public String toString() {
		return "IndAltaDiagEgreso [id_ind_alta=" + id_ind_alta + ", codigo=" + codigo + ", tipo_diagnostico="
				+ tipo_diagnostico + ", sensible=" + sensible + ", id_diagnostico_egreso=" + id_diagnostico_egreso
				+ "]";
	}
	
}
