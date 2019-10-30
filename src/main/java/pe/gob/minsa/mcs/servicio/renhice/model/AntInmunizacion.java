package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AntInmunizacion implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_paciente;
	private String mensaje_alerta;
	@JsonIgnore
	private Integer id_inmunizacion;
	private List<AntInmunizacionEpisodio> inmunizaciones_episodios;
	
	public AntInmunizacion() {
		
	}

	public AntInmunizacion(Integer id_paciente, String mensaje_alerta, Integer id_inmunizacion,
			List<AntInmunizacionEpisodio> inmunizaciones_episodios) {
	
		this.id_paciente = id_paciente;
		this.mensaje_alerta = mensaje_alerta;
		this.id_inmunizacion = id_inmunizacion;
		this.inmunizaciones_episodios = inmunizaciones_episodios;
	}

	public Integer getId_paciente() {
		return id_paciente;
	}

	public String getMensaje_alerta() {
		return mensaje_alerta;
	}

	public Integer getId_inmunizacion() {
		return id_inmunizacion;
	}

	public List<AntInmunizacionEpisodio> getInmunizaciones_episodios() {
		return inmunizaciones_episodios;
	}

	public void setId_paciente(Integer id_paciente) {
		this.id_paciente = id_paciente;
	}

	public void setMensaje_alerta(String mensaje_alerta) {
		this.mensaje_alerta = mensaje_alerta;
	}

	public void setId_inmunizacion(Integer id_inmunizacion) {
		this.id_inmunizacion = id_inmunizacion;
	}

	public void setInmunizaciones_episodios(List<AntInmunizacionEpisodio> inmunizaciones_episodios) {
		this.inmunizaciones_episodios = inmunizaciones_episodios;
	}

	@Override
	public String toString() {
		return "AntInmunizacion [id_paciente=" + id_paciente + ", mensaje_alerta=" + mensaje_alerta
				+ ", id_inmunizacion=" + id_inmunizacion + ", inmunizaciones_episodios=" + inmunizaciones_episodios
				+ "]";
	}
	
}
