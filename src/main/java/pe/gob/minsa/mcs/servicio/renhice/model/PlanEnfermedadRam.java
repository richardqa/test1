package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PlanEnfermedadRam implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_enfermedad_ram;
	private String codigo_ram;
	private String fecha_notificacion;
	private String sensible;
	@JsonIgnore
	private Integer id_episodio_atencion;
	
	public PlanEnfermedadRam() {
		
	}

	public PlanEnfermedadRam(Integer id_enfermedad_ram, String codigo_ram, String fecha_notificacion, String sensible,
			Integer id_episodio_atencion) {

		this.id_enfermedad_ram = id_enfermedad_ram;
		this.codigo_ram = codigo_ram;
		this.fecha_notificacion = fecha_notificacion;
		this.sensible = sensible;
		this.id_episodio_atencion = id_episodio_atencion;
	}

	public Integer getId_enfermedad_ram() {
		return id_enfermedad_ram;
	}

	public String getCodigo_ram() {
		return codigo_ram;
	}

	public String getFecha_notificacion() {
		return fecha_notificacion;
	}

	public String getSensible() {
		return sensible;
	}

	public Integer getId_episodio_atencion() {
		return id_episodio_atencion;
	}

	public void setId_enfermedad_ram(Integer id_enfermedad_ram) {
		this.id_enfermedad_ram = id_enfermedad_ram;
	}

	public void setCodigo_ram(String codigo_ram) {
		this.codigo_ram = codigo_ram;
	}

	public void setFecha_notificacion(String fecha_notificacion) {
		this.fecha_notificacion = fecha_notificacion;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	public void setId_episodio_atencion(Integer id_episodio_atencion) {
		this.id_episodio_atencion = id_episodio_atencion;
	}

	@Override
	public String toString() {
		return "PlanEnfermedadRam [id_enfermedad_ram=" + id_enfermedad_ram + ", codigo_ram=" + codigo_ram
				+ ", fecha_notificacion=" + fecha_notificacion + ", sensible=" + sensible + ", id_episodio_atencion="
				+ id_episodio_atencion + "]";
	}
	
}
