package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PlanExamenAuxiliarImagen implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_examen_auxiliar_imagen;
	private String codigo;
	private String informe_examen;
	private String fecha_ejecucion;
	private String sensible;
	@JsonIgnore
	private Integer id_episodio_atencion;
	
	public PlanExamenAuxiliarImagen() {
		
	}

	public Integer getId_examen_auxiliar_imagen() {
		return id_examen_auxiliar_imagen;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getInforme_examen() {
		return informe_examen;
	}

	public String getFecha_ejecucion() {
		return fecha_ejecucion;
	}

	public String getSensible() {
		return sensible;
	}

	public Integer getId_episodio_atencion() {
		return id_episodio_atencion;
	}

	public void setId_examen_auxiliar_imagen(Integer id_examen_auxiliar_imagen) {
		this.id_examen_auxiliar_imagen = id_examen_auxiliar_imagen;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setInforme_examen(String informe_examen) {
		this.informe_examen = informe_examen;
	}

	public void setFecha_ejecucion(String fecha_ejecucion) {
		this.fecha_ejecucion = fecha_ejecucion;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	public void setId_episodio_atencion(Integer id_episodio_atencion) {
		this.id_episodio_atencion = id_episodio_atencion;
	}

	@Override
	public String toString() {
		return "PlanExamenAuxiliarImagen [id_examen_auxiliar_imagen=" + id_examen_auxiliar_imagen + ", codigo=" + codigo
				+ ", informe_examen=" + informe_examen + ", fecha_ejecucion=" + fecha_ejecucion + ", sensible="
				+ sensible + ", id_episodio_atencion=" + id_episodio_atencion + "]";
	}
	
}
