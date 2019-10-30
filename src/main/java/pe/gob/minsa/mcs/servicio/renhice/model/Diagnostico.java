package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Diagnostico implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_diagnostico;
	private String codigo;
	private String tipo; 
	private String fecha;
	private String sensible;
	@JsonIgnore
	private Integer id_episodio_atencion;
	
	public Diagnostico() {
		
	}

	public Diagnostico(Integer id_diagnostico, String codigo, String tipo, String fecha, String sensible,
			Integer id_episodio_atencion) {
		
		this.id_diagnostico = id_diagnostico;
		this.codigo = codigo;
		this.tipo = tipo;
		this.fecha = fecha;
		this.sensible = sensible;
		this.id_episodio_atencion = id_episodio_atencion;
	}

	public Integer getId_diagnostico() {
		return id_diagnostico;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public String getFecha() {
		return fecha;
	}

	public String getSensible() {
		return sensible;
	}

	public Integer getId_episodio_atencion() {
		return id_episodio_atencion;
	}

	public void setId_diagnostico(Integer id_diagnostico) {
		this.id_diagnostico = id_diagnostico;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	public void setId_episodio_atencion(Integer id_episodio_atencion) {
		this.id_episodio_atencion = id_episodio_atencion;
	}

	@Override
	public String toString() {
		return "Diagnostico [id_diagnostico=" + id_diagnostico + ", codigo=" + codigo + ", tipo=" + tipo + ", fecha="
				+ fecha + ", sensible=" + sensible + ", id_episodio_atencion=" + id_episodio_atencion + "]";
	}
	
}
