package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

public class AntFamiliar2doConsanguineidad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idFamiliar;
	private String idPaciente;
	private String tipoParentezco;
	private String codigoCie10;
	private String fuenteInformacion;
	private String periodo;
	private String sensible;
	
	public AntFamiliar2doConsanguineidad() {}

	public AntFamiliar2doConsanguineidad(String idFamiliar, String idPaciente, String tipoParentezco,
			String codigoCie10, String fuenteInformacion, String periodo, String sensible) {
		super();
		this.idFamiliar = idFamiliar;
		this.idPaciente = idPaciente;
		this.tipoParentezco = tipoParentezco;
		this.codigoCie10 = codigoCie10;
		this.fuenteInformacion = fuenteInformacion;
		this.periodo = periodo;
		this.sensible = sensible;
	}

	public String getIdFamiliar() {
		return idFamiliar;
	}

	public void setIdFamiliar(String idFamiliar) {
		this.idFamiliar = idFamiliar;
	}

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getTipoParentezco() {
		return tipoParentezco;
	}

	public void setTipoParentezco(String tipoParentezco) {
		this.tipoParentezco = tipoParentezco;
	}

	public String getCodigoCie10() {
		return codigoCie10;
	}

	public void setCodigoCie10(String codigoCie10) {
		this.codigoCie10 = codigoCie10;
	}

	public String getFuenteInformacion() {
		return fuenteInformacion;
	}

	public void setFuenteInformacion(String fuenteInformacion) {
		this.fuenteInformacion = fuenteInformacion;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
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
