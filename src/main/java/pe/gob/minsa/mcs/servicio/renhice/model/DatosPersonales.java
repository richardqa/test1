package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

public class DatosPersonales implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String codigo_pais;
	private String ubigeo_nacimiento;
	private String fecha_nacimiento;
	private String codigo_sexo;
	
	public DatosPersonales() {
		
	}

	public DatosPersonales(String codigo_pais, String ubigeo_nacimiento, String fecha_nacimiento, String codigo_sexo) {
	
		this.codigo_pais = codigo_pais;
		this.ubigeo_nacimiento = ubigeo_nacimiento;
		this.fecha_nacimiento = fecha_nacimiento;
		this.codigo_sexo = codigo_sexo;
	}

	public String getCodigo_pais() {
		return codigo_pais;
	}

	public void setCodigo_pais(String codigo_pais) {
		this.codigo_pais = codigo_pais;
	}

	public String getUbigeo_nacimiento() {
		return ubigeo_nacimiento;
	}

	public void setUbigeo_nacimiento(String ubigeo_nacimiento) {
		this.ubigeo_nacimiento = ubigeo_nacimiento;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getCodigo_sexo() {
		return codigo_sexo;
	}

	public void setCodigo_sexo(String codigo_sexo) {
		this.codigo_sexo = codigo_sexo;
	}

	@Override
	public String toString() {
		return "DatosPersonales [codigo_pais=" + codigo_pais + ", ubigeo_nacimiento=" + ubigeo_nacimiento
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", codigo_sexo=" + codigo_sexo + "]";
	}
	
}
