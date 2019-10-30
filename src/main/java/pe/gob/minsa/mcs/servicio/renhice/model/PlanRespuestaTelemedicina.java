package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PlanRespuestaTelemedicina implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_respuesta_telemedicina;
	private String id_respuesta_teleconsulta;
	private String respuesta;
	private String fecha_respuesta_teleconsulta;
	private String sensible;
	@JsonIgnore
	private Integer id_episodio_atencion;
	
	public PlanRespuestaTelemedicina() {
		
	}

	public PlanRespuestaTelemedicina(Integer id_respuesta_telemedicina, String id_respuesta_teleconsulta,
			String respuesta, String fecha_respuesta_teleconsulta, String sensible, Integer id_episodio_atencion) {
	
		this.id_respuesta_telemedicina = id_respuesta_telemedicina;
		this.id_respuesta_teleconsulta = id_respuesta_teleconsulta;
		this.respuesta = respuesta;
		this.fecha_respuesta_teleconsulta = fecha_respuesta_teleconsulta;
		this.sensible = sensible;
		this.id_episodio_atencion = id_episodio_atencion;
	}

	public Integer getId_respuesta_telemedicina() {
		return id_respuesta_telemedicina;
	}

	public String getId_respuesta_teleconsulta() {
		return id_respuesta_teleconsulta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public String getFecha_respuesta_teleconsulta() {
		return fecha_respuesta_teleconsulta;
	}

	public String getSensible() {
		return sensible;
	}

	public Integer getId_episodio_atencion() {
		return id_episodio_atencion;
	}

	public void setId_respuesta_telemedicina(Integer id_respuesta_telemedicina) {
		this.id_respuesta_telemedicina = id_respuesta_telemedicina;
	}

	public void setId_respuesta_teleconsulta(String id_respuesta_teleconsulta) {
		this.id_respuesta_teleconsulta = id_respuesta_teleconsulta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public void setFecha_respuesta_teleconsulta(String fecha_respuesta_teleconsulta) {
		this.fecha_respuesta_teleconsulta = fecha_respuesta_teleconsulta;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	public void setId_episodio_atencion(Integer id_episodio_atencion) {
		this.id_episodio_atencion = id_episodio_atencion;
	}

	@Override
	public String toString() {
		return "PlanRespuestaTelemedicina [id_respuesta_telemedicina=" + id_respuesta_telemedicina
				+ ", id_respuesta_teleconsulta=" + id_respuesta_teleconsulta + ", respuesta=" + respuesta
				+ ", fecha_respuesta_teleconsulta=" + fecha_respuesta_teleconsulta + ", sensible=" + sensible
				+ ", id_episodio_atencion=" + id_episodio_atencion + "]";
	}
	
}
