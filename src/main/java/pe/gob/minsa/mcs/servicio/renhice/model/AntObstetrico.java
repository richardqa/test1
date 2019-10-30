package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AntObstetrico implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_paciente;
	private String gestaciones;
	@JsonIgnore
	private Integer id_obstetrico;
	private List<AntObsParto> partos;
	
	public AntObstetrico() {
		
	}
	
	public AntObstetrico(Integer id_paciente, String gestaciones, Integer id_obstetrico, List<AntObsParto> partos) {
	
		this.id_paciente = id_paciente;
		this.gestaciones = gestaciones;
		this.id_obstetrico = id_obstetrico;
		this.partos = partos;
	}

	public Integer getId_paciente() {
		return id_paciente;
	}

	public String getGestaciones() {
		return gestaciones;
	}

	public Integer getId_obstetrico() {
		return id_obstetrico;
	}

	public List<AntObsParto> getPartos() {
		return partos;
	}

	public void setId_paciente(Integer id_paciente) {
		this.id_paciente = id_paciente;
	}

	public void setGestaciones(String gestaciones) {
		this.gestaciones = gestaciones;
	}

	public void setId_obstetrico(Integer id_obstetrico) {
		this.id_obstetrico = id_obstetrico;
	}

	public void setPartos(List<AntObsParto> partos) {
		this.partos = partos;
	}
	
}
