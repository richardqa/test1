package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PlanExamenAuxiliarLaboratorio implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_examen_auxiliar_laboratorio;
	private String codigo;
	private String informe_examen;
	private String fecha_ejecucion;
	private String sensible;
	@JsonIgnore
	private String id_episodio_atencion;
	
	public PlanExamenAuxiliarLaboratorio() {
		
	}

	public PlanExamenAuxiliarLaboratorio(Integer id_examen_auxiliar_laboratorio, String codigo, String informe_examen,
			String fecha_ejecucion, String sensible, String id_episodio_atencion) {
		
		this.id_examen_auxiliar_laboratorio = id_examen_auxiliar_laboratorio;
		this.codigo = codigo;
		this.informe_examen = informe_examen;
		this.fecha_ejecucion = fecha_ejecucion;
		this.sensible = sensible;
		this.id_episodio_atencion = id_episodio_atencion;
	}

	public Integer getId_examen_auxiliar_laboratorio() {
		return id_examen_auxiliar_laboratorio;
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

	public String getId_episodio_atencion() {
		return id_episodio_atencion;
	}

	public void setId_examen_auxiliar_laboratorio(Integer id_examen_auxiliar_laboratorio) {
		this.id_examen_auxiliar_laboratorio = id_examen_auxiliar_laboratorio;
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

	public void setId_episodio_atencion(String id_episodio_atencion) {
		this.id_episodio_atencion = id_episodio_atencion;
	}

	@Override
	public String toString() {
		return "PlanExamenAuxiliarLaboratorio [id_examen_auxiliar_laboratorio=" + id_examen_auxiliar_laboratorio
				+ ", codigo=" + codigo + ", informe_examen=" + informe_examen + ", fecha_ejecucion=" + fecha_ejecucion
				+ ", sensible=" + sensible + ", id_episodio_atencion=" + id_episodio_atencion + "]";
	}
	
}
