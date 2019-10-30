package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

public class AntInmEpisodio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idInmEpisodio;
	private String idPaciente;
	private String codigo;
	private String fuenteInformacion;
	private String periodo;
	private String sensible;
	private String idInmunizacion;
	
	public AntInmEpisodio() {}

	public AntInmEpisodio(String idInmEpisodio, String idPaciente, String codigo, String fuenteInformacion,
			String periodo, String sensible, String idInmunizacion) {
		super();
		this.idInmEpisodio = idInmEpisodio;
		this.idPaciente = idPaciente;
		this.codigo = codigo;
		this.fuenteInformacion = fuenteInformacion;
		this.periodo = periodo;
		this.sensible = sensible;
		this.idInmunizacion = idInmunizacion;
	}

	public String getIdInmEpisodio() {
		return idInmEpisodio;
	}

	public void setIdInmEpisodio(String idInmEpisodio) {
		this.idInmEpisodio = idInmEpisodio;
	}

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFuenteInformacion() {
		return fuenteInformacion;
	}

	public void setFuenteInformacion(String fuenteInformacion) {
		this.fuenteInformacion = fuenteInformacion;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getSensible() {
		return sensible;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	public String getIdInmunizacion() {
		return idInmunizacion;
	}

	public void setIdInmunizacion(String idInmunizacion) {
		this.idInmunizacion = idInmunizacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
