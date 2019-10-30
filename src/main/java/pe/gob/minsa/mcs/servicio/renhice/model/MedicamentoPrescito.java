package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

public class MedicamentoPrescito implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String idMedicamentoPrescito;
	private String idIndAlta;
	private String codigoMedicamento;
	private String codigoPresentacion;
	private String dosis;
	private String viaAdministracion;
	private String duracionTratamiento;
	private String fechaPrescipcion;
	private String sensible;
	
	public MedicamentoPrescito() { }

	public MedicamentoPrescito(String idMedicamentoPrescito, String idIndAlta, String codigoMedicamento,
			String codigoPresentacion, String dosis, String viaAdministracion, String duracionTratamiento,
			String fechaPrescipcion, String sensible) {
		super();
		this.idMedicamentoPrescito = idMedicamentoPrescito;
		this.idIndAlta = idIndAlta;
		this.codigoMedicamento = codigoMedicamento;
		this.codigoPresentacion = codigoPresentacion;
		this.dosis = dosis;
		this.viaAdministracion = viaAdministracion;
		this.duracionTratamiento = duracionTratamiento;
		this.fechaPrescipcion = fechaPrescipcion;
		this.sensible = sensible;
	}

	public String getIdMedicamentoPrescito() {
		return idMedicamentoPrescito;
	}

	public void setIdMedicamentoPrescito(String idMedicamentoPrescito) {
		this.idMedicamentoPrescito = idMedicamentoPrescito;
	}

	public String getIdIndAlta() {
		return idIndAlta;
	}

	public void setIdIndAlta(String idIndAlta) {
		this.idIndAlta = idIndAlta;
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

	public String getViaAdministracion() {
		return viaAdministracion;
	}

	public void setViaAdministracion(String viaAdministracion) {
		this.viaAdministracion = viaAdministracion;
	}

	public String getDuracionTratamiento() {
		return duracionTratamiento;
	}

	public void setDuracionTratamiento(String duracionTratamiento) {
		this.duracionTratamiento = duracionTratamiento;
	}

	public String getFechaPrescipcion() {
		return fechaPrescipcion;
	}

	public void setFechaPrescipcion(String fechaPrescipcion) {
		this.fechaPrescipcion = fechaPrescipcion;
	}

	public String getSensible() {
		return sensible;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
    

}
