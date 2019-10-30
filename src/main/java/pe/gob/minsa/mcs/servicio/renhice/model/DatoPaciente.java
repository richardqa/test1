package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class DatoPaciente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_paciente;	
	private String fechahora_envio;
	private String usuario_envio;
	
	public DatoPaciente() {
		
	}
	
	public DatoPaciente(Integer id_paciente, String fechahora_envio, String usuario_envio) {
	
		this.id_paciente = id_paciente;
		this.fechahora_envio = fechahora_envio;
		this.usuario_envio = usuario_envio;
	}

	public Integer getId_paciente() {
		return id_paciente;
	}

	public String getFechahora_envio() {
		return fechahora_envio;
	}

	public String getUsuario_envio() {
		return usuario_envio;
	}

	public void setId_paciente(Integer id_paciente) {
		this.id_paciente = id_paciente;
	}

	public void setFechahora_envio(String fechahora_envio) {
		this.fechahora_envio = fechahora_envio;
	}

	public void setUsuario_envio(String usuario_envio) {
		this.usuario_envio = usuario_envio;
	}

	@Override
	public String toString() {
		return "DatoPaciente [id_paciente=" + id_paciente + ", fechahora_envio=" + fechahora_envio + ", usuario_envio="
				+ usuario_envio + "]";
	}
	
}
