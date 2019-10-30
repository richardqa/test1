package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MedicamentoPrescrito implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_ind_alta;
	private String codigo_medicamento;
	private String codigo_presentacion;
	private String dosis;
	private String via_administracion;
	private String duracion_tratamiento;
	private String fecha_prescripcion;
	private String sensible;
	@JsonIgnore
	private Integer id_medicamento_prescrito;
	
	public MedicamentoPrescrito() {
		
	}
	
	

	public MedicamentoPrescrito(Integer id_ind_alta, String codigo_medicamento, String codigo_presentacion,
			String dosis, String via_administracion, String duracion_tratamiento, String fecha_prescripcion,
			String sensible, Integer id_medicamento_prescrito) {
		
		this.id_ind_alta = id_ind_alta;
		this.codigo_medicamento = codigo_medicamento;
		this.codigo_presentacion = codigo_presentacion;
		this.dosis = dosis;
		this.via_administracion = via_administracion;
		this.duracion_tratamiento = duracion_tratamiento;
		this.fecha_prescripcion = fecha_prescripcion;
		this.sensible = sensible;
		this.id_medicamento_prescrito = id_medicamento_prescrito;
	}



	public Integer getId_ind_alta() {
		return id_ind_alta;
	}

	public String getCodigo_medicamento() {
		return codigo_medicamento;
	}

	public String getCodigo_presentacion() {
		return codigo_presentacion;
	}

	public String getDosis() {
		return dosis;
	}

	public String getVia_administracion() {
		return via_administracion;
	}

	public String getDuracion_tratamiento() {
		return duracion_tratamiento;
	}

	public String getFecha_prescripcion() {
		return fecha_prescripcion;
	}

	public String getSensible() {
		return sensible;
	}

	public Integer getId_medicamento_prescrito() {
		return id_medicamento_prescrito;
	}

	public void setId_ind_alta(Integer id_ind_alta) {
		this.id_ind_alta = id_ind_alta;
	}

	public void setCodigo_medicamento(String codigo_medicamento) {
		this.codigo_medicamento = codigo_medicamento;
	}

	public void setCodigo_presentacion(String codigo_presentacion) {
		this.codigo_presentacion = codigo_presentacion;
	}

	public void setDosis(String dosis) {
		this.dosis = dosis;
	}

	public void setVia_administracion(String via_administracion) {
		this.via_administracion = via_administracion;
	}

	public void setDuracion_tratamiento(String duracion_tratamiento) {
		this.duracion_tratamiento = duracion_tratamiento;
	}

	public void setFecha_prescripcion(String fecha_prescripcion) {
		this.fecha_prescripcion = fecha_prescripcion;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	public void setId_medicamento_prescrito(Integer id_medicamento_prescrito) {
		this.id_medicamento_prescrito = id_medicamento_prescrito;
	}

	@Override
	public String toString() {
		return "MedicamentoPrescrito [id_ind_alta=" + id_ind_alta + ", codigo_medicamento=" + codigo_medicamento
				+ ", codigo_presentacion=" + codigo_presentacion + ", dosis=" + dosis + ", via_administracion="
				+ via_administracion + ", duracion_tratamiento=" + duracion_tratamiento + ", fecha_prescripcion="
				+ fecha_prescripcion + ", sensible=" + sensible + ", id_medicamento_prescrito="
				+ id_medicamento_prescrito + "]";
	}
	
}
