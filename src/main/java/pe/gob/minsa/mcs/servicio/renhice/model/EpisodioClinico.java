package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class EpisodioClinico implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_episodio_clinico;
	private String codigo;
	private String fecha_inicio_episodio_clinico;
	private String hora_inicio_episodio_clinico;
	private String fecha_cierre_episodio_clinico;
	private String hora_cierre_episodio_clinico;
	private String fecha_cierre_envio;
	private String hora_cierre_envio;
	private List<EpisodioAtencion> episodio_atencion;
	
	public EpisodioClinico() {
		
	}

	public EpisodioClinico(Integer id_episodio_clinico, String codigo, String fecha_inicio_episodio_clinico,
			String hora_inicio_episodio_clinico, String fecha_cierre_episodio_clinico,
			String hora_cierre_episodio_clinico, String fecha_cierre_envio, String hora_cierre_envio,
			List<EpisodioAtencion> episodio_atencion) {
	
		this.id_episodio_clinico = id_episodio_clinico;
		this.codigo = codigo;
		this.fecha_inicio_episodio_clinico = fecha_inicio_episodio_clinico;
		this.hora_inicio_episodio_clinico = hora_inicio_episodio_clinico;
		this.fecha_cierre_episodio_clinico = fecha_cierre_episodio_clinico;
		this.hora_cierre_episodio_clinico = hora_cierre_episodio_clinico;
		this.fecha_cierre_envio = fecha_cierre_envio;
		this.hora_cierre_envio = hora_cierre_envio;
		this.episodio_atencion = episodio_atencion;
	}


	public Integer getId_episodio_clinico() {
		return id_episodio_clinico;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getFecha_inicio_episodio_clinico() {
		return fecha_inicio_episodio_clinico;
	}

	public String getHora_inicio_episodio_clinico() {
		return hora_inicio_episodio_clinico;
	}

	public String getFecha_cierre_episodio_clinico() {
		return fecha_cierre_episodio_clinico;
	}

	public String getHora_cierre_episodio_clinico() {
		return hora_cierre_episodio_clinico;
	}

	public String getFecha_cierre_envio() {
		return fecha_cierre_envio;
	}

	public String getHora_cierre_envio() {
		return hora_cierre_envio;
	}

	public List<EpisodioAtencion> getEpisodio_atencion() {
		return episodio_atencion;
	}

	public void setId_episodio_clinico(Integer id_episodio_clinico) {
		this.id_episodio_clinico = id_episodio_clinico;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setFecha_inicio_episodio_clinico(String fecha_inicio_episodio_clinico) {
		this.fecha_inicio_episodio_clinico = fecha_inicio_episodio_clinico;
	}

	public void setHora_inicio_episodio_clinico(String hora_inicio_episodio_clinico) {
		this.hora_inicio_episodio_clinico = hora_inicio_episodio_clinico;
	}

	public void setFecha_cierre_episodio_clinico(String fecha_cierre_episodio_clinico) {
		this.fecha_cierre_episodio_clinico = fecha_cierre_episodio_clinico;
	}

	public void setHora_cierre_episodio_clinico(String hora_cierre_episodio_clinico) {
		this.hora_cierre_episodio_clinico = hora_cierre_episodio_clinico;
	}

	public void setFecha_cierre_envio(String fecha_cierre_envio) {
		this.fecha_cierre_envio = fecha_cierre_envio;
	}

	public void setHora_cierre_envio(String hora_cierre_envio) {
		this.hora_cierre_envio = hora_cierre_envio;
	}

	public void setEpisodio_atencion(List<EpisodioAtencion> episodio_atencion) {
		this.episodio_atencion = episodio_atencion;
	}

	@Override
	public String toString() {
		return "EpisodioClinico [id_episodio_clinico=" + id_episodio_clinico + ", codigo=" + codigo
				+ ", fecha_inicio_episodio_clinico=" + fecha_inicio_episodio_clinico + ", hora_inicio_episodio_clinico="
				+ hora_inicio_episodio_clinico + ", fecha_cierre_episodio_clinico=" + fecha_cierre_episodio_clinico
				+ ", hora_cierre_episodio_clinico=" + hora_cierre_episodio_clinico + ", fecha_cierre_envio="
				+ fecha_cierre_envio + ", hora_cierre_envio=" + hora_cierre_envio + ", episodio_atencion="
				+ episodio_atencion + "]";
	}
	
}
