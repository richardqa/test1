package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

public class DatosPersonalesSensibles implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String grupo_sanguineo;
	private String factor_rh;
	
	public DatosPersonalesSensibles() {
		
	}

	public DatosPersonalesSensibles(String grupo_sanguineo, String factor_rh) {
		super();
		this.grupo_sanguineo = grupo_sanguineo;
		this.factor_rh = factor_rh;
	}

	public String getGrupo_sanguineo() {
		return grupo_sanguineo;
	}

	public void setGrupo_sanguineo(String grupo_sanguineo) {
		this.grupo_sanguineo = grupo_sanguineo;
	}

	public String getFactor_rh() {
		return factor_rh;
	}

	public void setFactor_rh(String factor_rh) {
		this.factor_rh = factor_rh;
	}

	@Override
	public String toString() {
		return "DatosPersonalesSensibles [grupo_sanguineo=" + grupo_sanguineo + ", factor_rh=" + factor_rh + "]";
	}
		
}
