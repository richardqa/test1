package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

public class DiagnosticoEgreso implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String idDiagnosticoEgreso;
	private String idIndAlta;
	private String codigo;
	private String tipoDiagnostico;
	private String sensible;
	
	public DiagnosticoEgreso(){ }

	public DiagnosticoEgreso(String idDiagnosticoEgreso, String idIndAlta, String codigo, String tipoDiagnostico,
			String sensible) {
		super();
		this.idDiagnosticoEgreso = idDiagnosticoEgreso;
		this.idIndAlta = idIndAlta;
		this.codigo = codigo;
		this.tipoDiagnostico = tipoDiagnostico;
		this.sensible = sensible;
	}

	public String getIdDiagnosticoEgreso() {
		return idDiagnosticoEgreso;
	}

	public void setIdDiagnosticoEgreso(String idDiagnosticoEgreso) {
		this.idDiagnosticoEgreso = idDiagnosticoEgreso;
	}

	public String getIdIndAlta() {
		return idIndAlta;
	}

	public void setIdIndAlta(String idIndAlta) {
		this.idIndAlta = idIndAlta;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipoDiagnostico() {
		return tipoDiagnostico;
	}

	public void setTipoDiagnostico(String tipoDiagnostico) {
		this.tipoDiagnostico = tipoDiagnostico;
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
