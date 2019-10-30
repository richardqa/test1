package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

public class TraMedicamento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idTraMedicamento;
	private String codigoMedicamento;
	private String codigoPresentacion;
	private String dosis;
	private String viaAdministracion;
	private String duracionTratamiento;
	private String fechaPrescripcion;
	private String sensible;
	private String idEpisodioAtencion;
	
	public TraMedicamento() { }

	public TraMedicamento(String idTraMedicamento, String codigoMedicamento, String codigoPresentacion, String dosis,
			String viaAdministracion, String duracionTratamiento, String fechaPrescripcion, String sensible,
			String idEpisodioAtencion) {
		super();
		this.idTraMedicamento = idTraMedicamento;
		this.codigoMedicamento = codigoMedicamento;
		this.codigoPresentacion = codigoPresentacion;
		this.dosis = dosis;
		this.viaAdministracion = viaAdministracion;
		this.duracionTratamiento = duracionTratamiento;
		this.fechaPrescripcion = fechaPrescripcion;
		this.sensible = sensible;
		this.idEpisodioAtencion = idEpisodioAtencion;
	}

	public String getIdTraMedicamento() {
		return idTraMedicamento;
	}

	public void setIdTraMedicamento(String idTraMedicamento) {
		this.idTraMedicamento = idTraMedicamento;
	}

	public String getCodigoMedicamento() {
		return codigoMedicamento;
	}

	public void setCodigoMedicamento(String codigoMedicamento) {
		this.codigoMedicamento = codigoMedicamento;
	}

	public String getCodigoPresentacion() {
		return codigoPresentacion;
	}

	public void setCodigoPresentacion(String codigoPresentacion) {
		this.codigoPresentacion = codigoPresentacion;
	}

	public String getDosis() {
		return dosis;
	}

	public void setDosis(String dosis) {
		this.dosis = dosis;
	}

	public String getDuracionTratamiento() {
		return duracionTratamiento;
	}

	public void setDuracionTratamiento(String duracionTratamiento) {
		this.duracionTratamiento = duracionTratamiento;
	}

	public String getFechaPrescripcion() {
		return fechaPrescripcion;
	}

	public void setFechaPrescripcion(String fechaPrescripcion) {
		this.fechaPrescripcion = fechaPrescripcion;
	}

	public String getSensible() {
		return sensible;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
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

	public String getViaAdministracion() {
		return viaAdministracion;
	}

	public void setViaAdministracion(String viaAdministracion) {
		this.viaAdministracion = viaAdministracion;
	}

	
}
