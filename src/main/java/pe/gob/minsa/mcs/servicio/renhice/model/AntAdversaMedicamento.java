package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AntAdversaMedicamento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_adversa;
	@JsonIgnore
	private Integer id_paciente;
	private String codigo;
	private String gravedad;
	private String codigo_medicamento;
	private String fuente_informacion;
	private String periodo;
	private String sensible;
	
	public AntAdversaMedicamento() {
		
	}
	
	public AntAdversaMedicamento(Integer id_adversa, Integer id_paciente, String codigo, String gravedad,
			String codigo_medicamento, String fuente_informacion, String periodo, String sensible) {

		this.id_adversa = id_adversa;
		this.id_paciente = id_paciente;
		this.codigo = codigo;
		this.gravedad = gravedad;
		this.codigo_medicamento = codigo_medicamento;
		this.fuente_informacion = fuente_informacion;
		this.periodo = periodo;
		this.sensible = sensible;
	}



	public Integer getId_adversa() {
		return id_adversa;
	}

	public Integer getId_paciente() {
		return id_paciente;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getGravedad() {
		return gravedad;
	}

	public String getCodigo_medicamento() {
		return codigo_medicamento;
	}

	public String getFuente_informacion() {
		return fuente_informacion;
	}

	public String getPeriodo() {
		return periodo;
	}

	public String getSensible() {
		return sensible;
	}

	public void setId_adversa(Integer id_adversa) {
		this.id_adversa = id_adversa;
	}

	public void setId_paciente(Integer id_paciente) {
		this.id_paciente = id_paciente;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setGravedad(String gravedad) {
		this.gravedad = gravedad;
	}

	public void setCodigo_medicamento(String codigo_medicamento) {
		this.codigo_medicamento = codigo_medicamento;
	}

	public void setFuente_informacion(String fuente_informacion) {
		this.fuente_informacion = fuente_informacion;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	@Override
	public String toString() {
		return "AntAdversaMedicamento [id_adversa=" + id_adversa + ", id_paciente=" + id_paciente + ", codigo=" + codigo
				+ ", gravedad=" + gravedad + ", codigo_medicamento=" + codigo_medicamento + ", fuente_informacion="
				+ fuente_informacion + ", periodo=" + periodo + ", sensible=" + sensible + "]";
	}
	
}
