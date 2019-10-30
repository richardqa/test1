package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PlanRespuestaInterconsulta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_respuesta_interconsulta;
	private String id_interconsulta;
	private String servicio_solicitante;
	private String servicio_destino;
	private String informe_respuesta;
	private String fecha_respuesta;
	private String sensible;
	@JsonIgnore
	private Integer id_episodio_atencion;
	
	public PlanRespuestaInterconsulta() {
		
	}

	public PlanRespuestaInterconsulta(Integer id_respuesta_interconsulta, String id_interconsulta,
			String servicio_solicitante, String servicio_destino, String informe_respuesta, String fecha_respuesta,
			String sensible, Integer id_episodio_atencion) {

		this.id_respuesta_interconsulta = id_respuesta_interconsulta;
		this.id_interconsulta = id_interconsulta;
		this.servicio_solicitante = servicio_solicitante;
		this.servicio_destino = servicio_destino;
		this.informe_respuesta = informe_respuesta;
		this.fecha_respuesta = fecha_respuesta;
		this.sensible = sensible;
		this.id_episodio_atencion = id_episodio_atencion;
	}

	public Integer getId_respuesta_interconsulta() {
		return id_respuesta_interconsulta;
	}

	public String getId_interconsulta() {
		return id_interconsulta;
	}

	public String getServicio_solicitante() {
		return servicio_solicitante;
	}

	public String getServicio_destino() {
		return servicio_destino;
	}

	public String getInforme_respuesta() {
		return informe_respuesta;
	}

	public String getFecha_respuesta() {
		return fecha_respuesta;
	}

	public String getSensible() {
		return sensible;
	}

	public Integer getId_episodio_atencion() {
		return id_episodio_atencion;
	}

	public void setId_respuesta_interconsulta(Integer id_respuesta_interconsulta) {
		this.id_respuesta_interconsulta = id_respuesta_interconsulta;
	}

	public void setId_interconsulta(String id_interconsulta) {
		this.id_interconsulta = id_interconsulta;
	}

	public void setServicio_solicitante(String servicio_solicitante) {
		this.servicio_solicitante = servicio_solicitante;
	}

	public void setServicio_destino(String servicio_destino) {
		this.servicio_destino = servicio_destino;
	}

	public void setInforme_respuesta(String informe_respuesta) {
		this.informe_respuesta = informe_respuesta;
	}

	public void setFecha_respuesta(String fecha_respuesta) {
		this.fecha_respuesta = fecha_respuesta;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	public void setId_episodio_atencion(Integer id_episodio_atencion) {
		this.id_episodio_atencion = id_episodio_atencion;
	}

	@Override
	public String toString() {
		return "PlanRespuestaInterconsulta [id_respuesta_interconsulta=" + id_respuesta_interconsulta
				+ ", id_interconsulta=" + id_interconsulta + ", servicio_solicitante=" + servicio_solicitante
				+ ", servicio_destino=" + servicio_destino + ", informe_respuesta=" + informe_respuesta
				+ ", fecha_respuesta=" + fecha_respuesta + ", sensible=" + sensible + ", id_episodio_atencion="
				+ id_episodio_atencion + "]";
	}
	
}
