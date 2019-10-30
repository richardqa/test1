package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AntEpidemiologico implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_epidemiologico;
	@JsonIgnore
	private Integer id_paciente;
	private String codigo;
	private String tipo;
	private String periodo;
	private String sensible;
	
	public AntEpidemiologico() {
		
	}
	
	public AntEpidemiologico(Integer id_epidemiologico, Integer id_paciente, String codigo, String tipo, String periodo,
			String sensible) {
		super();
		this.id_epidemiologico = id_epidemiologico;
		this.id_paciente = id_paciente;
		this.codigo = codigo;
		this.tipo = tipo;
		this.periodo = periodo;
		this.sensible = sensible;
	}

	public Integer getId_epidemiologico() {
		return id_epidemiologico;
	}

	public void setId_epidemiologico(Integer id_epidemiologico) {
		this.id_epidemiologico = id_epidemiologico;
	}

	public Integer getId_paciente() {
		return id_paciente;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public String getPeriodo() {
		return periodo;
	}

	public String getSensible() {
		return sensible;
	}

	public void setId_paciente(Integer id_paciente) {
		this.id_paciente = id_paciente;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	@Override
	public String toString() {
		return "AntEpidemiologico [id_epidemiologico=" + id_epidemiologico + ", id_paciente=" + id_paciente
				+ ", codigo=" + codigo + ", tipo=" + tipo + ", periodo=" + periodo + ", sensible=" + sensible + "]";
	}
	
}
