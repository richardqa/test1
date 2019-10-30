package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AntAlergia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_alergia;
	@JsonIgnore
	private Integer id_paciente;
	private String codigo;
	private String alergeno;
	private String fuente_informacion;
	private String periodo;
	private String sensible;
	
	public AntAlergia() {
		
	}

	public AntAlergia(Integer id_alergia, Integer id_paciente, String codigo, String alergeno,
			String fuente_informacion, String periodo, String sensible) {
	
		this.id_alergia = id_alergia;
		this.id_paciente = id_paciente;
		this.codigo = codigo;
		this.alergeno = alergeno;
		this.fuente_informacion = fuente_informacion;
		this.periodo = periodo;
		this.sensible = sensible;
	}
	
	public Integer getId_alergia() {
		return id_alergia;
	}

	public void setId_alergia(Integer id_alergia) {
		this.id_alergia = id_alergia;
	}

	public Integer getId_paciente() {
		return id_paciente;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getAlergeno() {
		return alergeno;
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

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setAlergeno(String alergeno) {
		this.alergeno = alergeno;
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
		return "AntAlergia [id_alergia=" + id_alergia + ", id_paciente=" + id_paciente + ", codigo=" + codigo
				+ ", alergeno=" + alergeno + ", fuente_informacion=" + fuente_informacion + ", periodo=" + periodo
				+ ", sensible=" + sensible + "]";
	}	

}
