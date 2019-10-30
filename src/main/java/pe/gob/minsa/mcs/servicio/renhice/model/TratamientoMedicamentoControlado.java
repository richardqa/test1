package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class TratamientoMedicamentoControlado implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonIgnore
	private Integer id_tra_medicamento_controlado;
	private String codigo_forma_farmaceutica;
	private String cantidad_unidades;
	private String fecha_indicacion;
	private String codigo_procedimiento_recuperativo;
	private String cantidad_sesiones;
	private String fecha_prescripcion;
	private String sensible;
	@JsonIgnore
	private Integer id_episodio_atencion;

	public TratamientoMedicamentoControlado() {

	}

	public TratamientoMedicamentoControlado(Integer id_tra_medicamento_controlado, String codigo_forma_farmaceutica,
			String cantidad_unidades, String fecha_indicacion, String codigo_procedimiento_recuperativo,
			String cantidad_sesiones, String fecha_prescripcion, String sensible, Integer id_episodio_atencion) {
	
		this.id_tra_medicamento_controlado = id_tra_medicamento_controlado;
		this.codigo_forma_farmaceutica = codigo_forma_farmaceutica;
		this.cantidad_unidades = cantidad_unidades;
		this.fecha_indicacion = fecha_indicacion;
		this.codigo_procedimiento_recuperativo = codigo_procedimiento_recuperativo;
		this.cantidad_sesiones = cantidad_sesiones;
		this.fecha_prescripcion = fecha_prescripcion;
		this.sensible = sensible;
		this.id_episodio_atencion = id_episodio_atencion;
	}

	public Integer getId_tra_medicamento_controlado() {
		return id_tra_medicamento_controlado;
	}

	public String getCodigo_forma_farmaceutica() {
		return codigo_forma_farmaceutica;
	}

	public String getCantidad_unidades() {
		return cantidad_unidades;
	}

	public String getFecha_indicacion() {
		return fecha_indicacion;
	}

	public String getCodigo_procedimiento_recuperativo() {
		return codigo_procedimiento_recuperativo;
	}

	public String getCantidad_sesiones() {
		return cantidad_sesiones;
	}

	public String getFecha_prescripcion() {
		return fecha_prescripcion;
	}

	public String getSensible() {
		return sensible;
	}

	public Integer getId_episodio_atencion() {
		return id_episodio_atencion;
	}

	public void setId_tra_medicamento_controlado(Integer id_tra_medicamento_controlado) {
		this.id_tra_medicamento_controlado = id_tra_medicamento_controlado;
	}

	public void setCodigo_forma_farmaceutica(String codigo_forma_farmaceutica) {
		this.codigo_forma_farmaceutica = codigo_forma_farmaceutica;
	}

	public void setCantidad_unidades(String cantidad_unidades) {
		this.cantidad_unidades = cantidad_unidades;
	}

	public void setFecha_indicacion(String fecha_indicacion) {
		this.fecha_indicacion = fecha_indicacion;
	}

	public void setCodigo_procedimiento_recuperativo(String codigo_procedimiento_recuperativo) {
		this.codigo_procedimiento_recuperativo = codigo_procedimiento_recuperativo;
	}

	public void setCantidad_sesiones(String cantidad_sesiones) {
		this.cantidad_sesiones = cantidad_sesiones;
	}

	public void setFecha_prescripcion(String fecha_prescripcion) {
		this.fecha_prescripcion = fecha_prescripcion;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	public void setId_episodio_atencion(Integer id_episodio_atencion) {
		this.id_episodio_atencion = id_episodio_atencion;
	}

	@Override
	public String toString() {
		return "TratamientoMedicamentoControlado [id_tra_medicamento_controlado=" + id_tra_medicamento_controlado
				+ ", codigo_forma_farmaceutica=" + codigo_forma_farmaceutica + ", cantidad_unidades="
				+ cantidad_unidades + ", fecha_indicacion=" + fecha_indicacion + ", codigo_procedimiento_recuperativo="
				+ codigo_procedimiento_recuperativo + ", cantidad_sesiones=" + cantidad_sesiones
				+ ", fecha_prescripcion=" + fecha_prescripcion + ", sensible=" + sensible + ", id_episodio_atencion="
				+ id_episodio_atencion + "]";
	}

}
