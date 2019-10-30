package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PacDatoPrestacionSalud implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_paciente;
	private String codigo_ipress;
	private String codigo_categoria_ipress;
	private String codigo_hce;
	@JsonIgnore
	private Integer id_dato_prestacion_salud; 
	
	public PacDatoPrestacionSalud() {
		
	}
	
	public PacDatoPrestacionSalud(Integer id_paciente, String codigo_ipress, String codigo_categoria_ipress,
			String codigo_hce, Integer id_dato_prestacion_salud) {

		this.id_paciente = id_paciente;
		this.codigo_ipress = codigo_ipress;
		this.codigo_categoria_ipress = codigo_categoria_ipress;
		this.codigo_hce = codigo_hce;
		this.id_dato_prestacion_salud = id_dato_prestacion_salud;
	}

	public Integer getId_paciente() {
		return id_paciente;
	}

	public String getCodigo_ipress() {
		return codigo_ipress;
	}

	public String getCodigo_categoria_ipress() {
		return codigo_categoria_ipress;
	}

	public String getCodigo_hce() {
		return codigo_hce;
	}

	public Integer getId_dato_prestacion_salud() {
		return id_dato_prestacion_salud;
	}

	public void setId_paciente(Integer id_paciente) {
		this.id_paciente = id_paciente;
	}

	public void setCodigo_ipress(String codigo_ipress) {
		this.codigo_ipress = codigo_ipress;
	}

	public void setCodigo_categoria_ipress(String codigo_categoria_ipress) {
		this.codigo_categoria_ipress = codigo_categoria_ipress;
	}

	public void setCodigo_hce(String codigo_hce) {
		this.codigo_hce = codigo_hce;
	}

	public void setId_dato_prestacion_salud(Integer id_dato_prestacion_salud) {
		this.id_dato_prestacion_salud = id_dato_prestacion_salud;
	}

	@Override
	public String toString() {
		return "PacDatoPrestacionSalud [id_paciente=" + id_paciente + ", codigo_ipress=" + codigo_ipress
				+ ", codigo_categoria_ipress=" + codigo_categoria_ipress + ", codigo_hce=" + codigo_hce
				+ ", id_dato_prestacion_salud=" + id_dato_prestacion_salud + "]";
	}
	
}
