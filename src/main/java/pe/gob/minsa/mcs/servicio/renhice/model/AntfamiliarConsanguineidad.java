package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AntfamiliarConsanguineidad implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_familiar;
	@JsonIgnore
	private Integer id_paciente;
	private String tipo_parentezco;
	private String codigo_cie10;
	private String fuente_informacion;
	private String periodo;
	private String sensible;
	
	public AntfamiliarConsanguineidad() {
		
	}

	public AntfamiliarConsanguineidad(Integer id_familiar, Integer id_paciente, String tipo_parentezco,
			String codigo_cie10, String fuente_informacion, String periodo, String sensible) {

		this.id_familiar = id_familiar;
		this.id_paciente = id_paciente;
		this.tipo_parentezco = tipo_parentezco;
		this.codigo_cie10 = codigo_cie10;
		this.fuente_informacion = fuente_informacion;
		this.periodo = periodo;
		this.sensible = sensible;
	}
		

	public Integer getId_familiar() {
		return id_familiar;
	}

	public void setId_familiar(Integer id_familiar) {
		this.id_familiar = id_familiar;
	}

	public Integer getId_paciente() {
		return id_paciente;
	}

	public String getTipo_parentezco() {
		return tipo_parentezco;
	}

	public String getCodigo_cie10() {
		return codigo_cie10;
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

	public void setId_paciente(Integer id_paciente) {
		this.id_paciente = id_paciente;
	}

	public void setTipo_parentezco(String tipo_parentezco) {
		this.tipo_parentezco = tipo_parentezco;
	}

	public void setCodigo_cie10(String codigo_cie10) {
		this.codigo_cie10 = codigo_cie10;
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
		return "AntfamiliarConsanguineidad [id_familiar=" + id_familiar + ", id_paciente=" + id_paciente
				+ ", tipo_parentezco=" + tipo_parentezco + ", codigo_cie10=" + codigo_cie10 + ", fuente_informacion="
				+ fuente_informacion + ", periodo=" + periodo + ", sensible=" + sensible + "]";
	}
	
}
