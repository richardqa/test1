package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AntHospitalizacionPrevia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_hospitalizacion;
	@JsonIgnore
	private Integer id_paciente;
	private String upss;
	private String codigo_cie10;
	private String fuente_informacion;
	private String periodo;
	private String sensible;
	
	public AntHospitalizacionPrevia() {
		
	}

	public AntHospitalizacionPrevia(Integer id_hospitalizacion, Integer id_paciente, String upss, String codigo_cie10,
			String fuente_informacion, String periodo, String sensible) {
	
		this.id_hospitalizacion = id_hospitalizacion;
		this.id_paciente = id_paciente;
		this.upss = upss;
		this.codigo_cie10 = codigo_cie10;
		this.fuente_informacion = fuente_informacion;
		this.periodo = periodo;
		this.sensible = sensible;
	}
	
	public Integer getId_hospitalizacion() {
		return id_hospitalizacion;
	}

	public void setId_hospitalizacion(Integer id_hospitalizacion) {
		this.id_hospitalizacion = id_hospitalizacion;
	}

	public Integer getId_paciente() {
		return id_paciente;
	}

	public String getUpss() {
		return upss;
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

	public void setUpss(String upss) {
		this.upss = upss;
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
		return "AntHospitalizacionPrevia [id_hospitalizacion=" + id_hospitalizacion + ", id_paciente=" + id_paciente
				+ ", upss=" + upss + ", codigo_cie10=" + codigo_cie10 + ", fuente_informacion=" + fuente_informacion
				+ ", periodo=" + periodo + ", sensible=" + sensible + "]";
	}
	
}
