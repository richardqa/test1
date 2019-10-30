package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AntMedicacionHabitual implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_medicacion;
	@JsonIgnore
	private Integer id_paciente;
	private String codigo_medicamento;
	private String fuente_informacion;
	private String fecha;
	private String periodo;
	private String sensible;

	public AntMedicacionHabitual(){
		
	}

	public AntMedicacionHabitual(Integer id_medicacion, Integer id_paciente, String codigo_medicamento,
			String fuente_informacion, String fecha, String periodo, String sensible) {
		
		this.id_medicacion = id_medicacion;
		this.id_paciente = id_paciente;
		this.codigo_medicamento = codigo_medicamento;
		this.fuente_informacion = fuente_informacion;
		this.fecha = fecha;
		this.periodo = periodo;
		this.sensible = sensible;
	}
	
	public Integer getId_medicacion() {
		return id_medicacion;
	}

	public void setId_medicacion(Integer id_medicacion) {
		this.id_medicacion = id_medicacion;
	}

	public Integer getId_paciente() {
		return id_paciente;
	}

	public String getCodigo_medicamento() {
		return codigo_medicamento;
	}

	public String getFuente_informacion() {
		return fuente_informacion;
	}

	public String getFecha() {
		return fecha;
	}

	public String getPeriodo() {
		return periodo;
	}

	public String getSensible() {
		return sensible;
	}

	public void setId_paciente(Integer id_paciente) {
		this.id_paciente = id_paciente;
	}

	public void setCodigo_medicamento(String codigo_medicamento) {
		this.codigo_medicamento = codigo_medicamento;
	}

	public void setFuente_informacion(String fuente_informacion) {
		this.fuente_informacion = fuente_informacion;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	@Override
	public String toString() {
		return "AntMedicacionHabitual [id_medicacion=" + id_medicacion + ", id_paciente=" + id_paciente
				+ ", codigo_medicamento=" + codigo_medicamento + ", fuente_informacion=" + fuente_informacion
				+ ", fecha=" + fecha + ", periodo=" + periodo + ", sensible=" + sensible + "]";
	}
	
}
