package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AntInmunizacionEpisodio implements Serializable{
    
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_paciente;
	private String codigo;
	private String fuente_informacion;
	private String periodo;
	private String sensible;
	@JsonIgnore
	private Integer id_inmunizacion;
	@JsonIgnore
	private Integer id_inm_episodio;
	
	public AntInmunizacionEpisodio() {
		
	}
	
	public AntInmunizacionEpisodio(Integer id_paciente, String codigo, String fuente_informacion, String periodo,
			String sensible, Integer id_inmunizacion, Integer id_inm_episodio) {
		
		this.id_paciente = id_paciente;
		this.codigo = codigo;
		this.fuente_informacion = fuente_informacion;
		this.periodo = periodo;
		this.sensible = sensible;
		this.id_inmunizacion = id_inmunizacion;
		this.id_inm_episodio = id_inm_episodio;
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

	public Integer getId_inmunizacion() {
		return id_inmunizacion;
	}

	public Integer getId_inm_episodio() {
		return id_inm_episodio;
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

	public void setId_inmunizacion(Integer id_inmunizacion) {
		this.id_inmunizacion = id_inmunizacion;
	}

	public void setId_inm_episodio(Integer id_inm_episodio) {
		this.id_inm_episodio = id_inm_episodio;
	}

	@Override
	public String toString() {
		return "AntInmunizacionEpisodio [id_paciente=" + id_paciente + ", codigo=" + codigo + ", fuente_informacion="
				+ fuente_informacion + ", periodo=" + periodo + ", sensible=" + sensible + ", id_inmunizacion="
				+ id_inmunizacion + ", id_inm_episodio=" + id_inm_episodio + "]";
	}
	
}
