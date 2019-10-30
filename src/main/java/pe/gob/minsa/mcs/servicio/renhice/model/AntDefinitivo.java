package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AntDefinitivo implements Serializable {
	 
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_definitivo;
	@JsonIgnore
	private Integer id_paciente;
	private String codigo;
	private String tipo;
	private String fecha_determinacion;
	private String periodo;
	private String sensible;
	
	public AntDefinitivo() {
		
	}
	
	public AntDefinitivo(Integer id_definitivo, Integer id_paciente, String codigo, String tipo,
			String fecha_determinacion, String periodo, String sensible) {
		
		this.id_definitivo = id_definitivo;
		this.id_paciente = id_paciente;
		this.codigo = codigo;
		this.tipo = tipo;
		this.fecha_determinacion = fecha_determinacion;
		this.periodo = periodo;
		this.sensible = sensible;
	}

	public Integer getId_definitivo() {
		return id_definitivo;
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

	public String getFecha_determinacion() {
		return fecha_determinacion;
	}

	public String getPeriodo() {
		return periodo;
	}

	public String getSensible() {
		return sensible;
	}

	public void setId_definitivo(Integer id_definitivo) {
		this.id_definitivo = id_definitivo;
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

	public void setFecha_determinacion(String fecha_determinacion) {
		this.fecha_determinacion = fecha_determinacion;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	@Override
	public String toString() {
		return "AntDefinitivo [id_definitivo=" + id_definitivo + ", id_paciente=" + id_paciente + ", codigo=" + codigo
				+ ", tipo=" + tipo + ", fecha_determinacion=" + fecha_determinacion + ", periodo=" + periodo
				+ ", sensible=" + sensible + "]";
	}
	
}
