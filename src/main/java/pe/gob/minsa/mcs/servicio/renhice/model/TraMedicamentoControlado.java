package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

public class TraMedicamentoControlado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idTraMedicamentoControlado;
	private String codigoFormaFarmaceutica;
	private String cantidadUnidades;
	private String fechaIndicacion;
	private String codigoProcedimientoRecuperativo;
	private String cantidadSesiones;
	private String fechaPrescripcion;
	private String sensible;
	private String idEpisodioAtencion;
	
	public TraMedicamentoControlado(){ }

	public TraMedicamentoControlado(String idTraMedicamentoControlado, String codigoFormaFarmaceutica,
			String cantidadUnidades, String fechaIndicacion, String codigoProcedimientoRecuperativo,
			String cantidadSesiones, String fechaPrescripcion, String sensible, String idEpisodioAtencion) {
		super();
		this.idTraMedicamentoControlado = idTraMedicamentoControlado;
		this.codigoFormaFarmaceutica = codigoFormaFarmaceutica;
		this.cantidadUnidades = cantidadUnidades;
		this.fechaIndicacion = fechaIndicacion;
		this.codigoProcedimientoRecuperativo = codigoProcedimientoRecuperativo;
		this.cantidadSesiones = cantidadSesiones;
		this.fechaPrescripcion = fechaPrescripcion;
		this.sensible = sensible;
		this.idEpisodioAtencion = idEpisodioAtencion;
	}

	public String getIdTraMedicamentoControlado() {
		return idTraMedicamentoControlado;
	}

	public void setIdTraMedicamentoControlado(String idTraMedicamentoControlado) {
		this.idTraMedicamentoControlado = idTraMedicamentoControlado;
	}

	public String getCodigoFormaFarmaceutica() {
		return codigoFormaFarmaceutica;
	}

	public void setCodigoFormaFarmaceutica(String codigoFormaFarmaceutica) {
		this.codigoFormaFarmaceutica = codigoFormaFarmaceutica;
	}

	public String getCantidadUnidades() {
		return cantidadUnidades;
	}

	public void setCantidadUnidades(String cantidadUnidades) {
		this.cantidadUnidades = cantidadUnidades;
	}

	public String getFechaIndicacion() {
		return fechaIndicacion;
	}

	public void setFechaIndicacion(String fechaIndicacion) {
		this.fechaIndicacion = fechaIndicacion;
	}

	public String getCodigoProcedimientoRecuperativo() {
		return codigoProcedimientoRecuperativo;
	}

	public void setCodigoProcedimientoRecuperativo(String codigoProcedimientoRecuperativo) {
		this.codigoProcedimientoRecuperativo = codigoProcedimientoRecuperativo;
	}

	public String getCantidadSesiones() {
		return cantidadSesiones;
	}

	public void setCantidadSesiones(String cantidadSesiones) {
		this.cantidadSesiones = cantidadSesiones;
	}

	public String getFechaPrescripcion() {
		return fechaPrescripcion;
	}

	public void setFechaPrescripcion(String fechaPrescripcion) {
		this.fechaPrescripcion = fechaPrescripcion;
	}

	public String getIdEpisodioAtencion() {
		return idEpisodioAtencion;
	}

	public void setIdEpisodioAtencion(String idEpisodioAtencion) {
		this.idEpisodioAtencion = idEpisodioAtencion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSensible() {
		return sensible;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	
}
