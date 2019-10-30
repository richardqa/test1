package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PacDatoPersonal implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_paciente;
	private String codigo_pais;
	private String ubigeo_nacimiento;
	private String fecha_nacimiento;
	private String codigo_sexo;
	@JsonIgnore
	private Integer id_dato_personal;
	
	public PacDatoPersonal() {
		
	}

	public PacDatoPersonal(Integer id_paciente, String codigo_pais, String ubigeo_nacimiento, String fecha_nacimiento,
			String codigo_sexo, Integer id_dato_personal) {
	
		this.id_paciente = id_paciente;
		this.codigo_pais = codigo_pais;
		this.ubigeo_nacimiento = ubigeo_nacimiento;
		this.fecha_nacimiento = fecha_nacimiento;
		this.codigo_sexo = codigo_sexo;
		this.id_dato_personal = id_dato_personal;
	}

	public Integer getId_paciente() {
		return id_paciente;
	}

	public String getCodigo_pais() {
		return codigo_pais;
	}

	public String getUbigeo_nacimiento() {
		return ubigeo_nacimiento;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public String getCodigo_sexo() {
		return codigo_sexo;
	}

	public Integer getId_dato_personal() {
		return id_dato_personal;
	}

	public void setId_paciente(Integer id_paciente) {
		this.id_paciente = id_paciente;
	}

	public void setCodigo_pais(String codigo_pais) {
		this.codigo_pais = codigo_pais;
	}

	public void setUbigeo_nacimiento(String ubigeo_nacimiento) {
		this.ubigeo_nacimiento = ubigeo_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public void setCodigo_sexo(String codigo_sexo) {
		this.codigo_sexo = codigo_sexo;
	}

	public void setId_dato_personal(Integer id_dato_personal) {
		this.id_dato_personal = id_dato_personal;
	}

	@Override
	public String toString() {
		return "PacDatoPersonal [id_paciente=" + id_paciente + ", codigo_pais=" + codigo_pais + ", ubigeo_nacimiento="
				+ ubigeo_nacimiento + ", fecha_nacimiento=" + fecha_nacimiento + ", codigo_sexo=" + codigo_sexo
				+ ", id_dato_personal=" + id_dato_personal + "]";
	}
	
}
