package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AntIntervencionQuirurgica implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_intervencion;
	@JsonIgnore
	private Integer id_paciente;
	private String codigo;
	private String fuente_informacion;
	private String periodo;
	private String sensible;
	
	public AntIntervencionQuirurgica() {
		
	}

	public AntIntervencionQuirurgica(Integer id_intervencion, Integer id_paciente, String codigo,
			String fuente_informacion, String periodo, String sensible) {
		super();
		this.id_intervencion = id_intervencion;
		this.id_paciente = id_paciente;
		this.codigo = codigo;
		this.fuente_informacion = fuente_informacion;
		this.periodo = periodo;
		this.sensible = sensible;
	}
	
	public Integer getId_intervencion() {
		return id_intervencion;
	}

	public Integer getId_paciente() {
		return id_paciente;
	}

	public String getCodigo() {
		return codigo;
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

	public void setId_intervencion(Integer id_intervencion) {
		this.id_intervencion = id_intervencion;
	}

	public void setId_paciente(Integer id_paciente) {
		this.id_paciente = id_paciente;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
		return "AntIntervencionQuirurgica [id_intervencion=" + id_intervencion + ", id_paciente=" + id_paciente
				+ ", codigo=" + codigo + ", fuente_informacion=" + fuente_informacion + ", periodo=" + periodo
				+ ", sensible=" + sensible + "]";
	} 
	
}
