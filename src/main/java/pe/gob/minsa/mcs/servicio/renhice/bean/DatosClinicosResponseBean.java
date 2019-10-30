package pe.gob.minsa.mcs.servicio.renhice.bean;

import java.io.Serializable;

public class DatosClinicosResponseBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String codigo;
	
	public DatosClinicosResponseBean() {
		
	}

	public DatosClinicosResponseBean(String codigo) {
		
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "DatosClinicosResponseBean [codigo=" + codigo + "]";
	}
	
	
}
