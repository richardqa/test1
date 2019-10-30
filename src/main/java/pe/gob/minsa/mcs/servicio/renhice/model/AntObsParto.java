package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AntObsParto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_paciente;
	private String via;
	private String nacidos_vivo;
	private String nacidos_muerto;
	private String nacimientos;
	private String fuente_informacion;
	private String sensible;
	@JsonIgnore
	private Integer id_obstetrico;
	@JsonIgnore
	private Integer id_obs_parto;
	
	public AntObsParto() {
		
	}
	
	public AntObsParto(Integer id_paciente, String via, String nacidos_vivo, String nacidos_muerto, String nacimientos,
			String fuente_informacion, String sensible, Integer id_obstetrico, Integer id_obs_parto) {
		
		this.id_paciente = id_paciente;
		this.via = via;
		this.nacidos_vivo = nacidos_vivo;
		this.nacidos_muerto = nacidos_muerto;
		this.nacimientos = nacimientos;
		this.fuente_informacion = fuente_informacion;
		this.sensible = sensible;
		this.id_obstetrico = id_obstetrico;
		this.id_obs_parto = id_obs_parto;
	}

	public Integer getId_paciente() {
		return id_paciente;
	}

	public String getVia() {
		return via;
	}

	public String getNacidos_vivo() {
		return nacidos_vivo;
	}

	public String getNacidos_muerto() {
		return nacidos_muerto;
	}

	public String getNacimientos() {
		return nacimientos;
	}

	public String getFuente_informacion() {
		return fuente_informacion;
	}

	public String getSensible() {
		return sensible;
	}

	public Integer getId_obstetrico() {
		return id_obstetrico;
	}

	public Integer getId_obs_parto() {
		return id_obs_parto;
	}

	public void setId_paciente(Integer id_paciente) {
		this.id_paciente = id_paciente;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public void setNacidos_vivo(String nacidos_vivo) {
		this.nacidos_vivo = nacidos_vivo;
	}

	public void setNacidos_muerto(String nacidos_muerto) {
		this.nacidos_muerto = nacidos_muerto;
	}

	public void setNacimientos(String nacimientos) {
		this.nacimientos = nacimientos;
	}

	public void setFuente_informacion(String fuente_informacion) {
		this.fuente_informacion = fuente_informacion;
	}

	public void setSensible(String sensible) {
		this.sensible = sensible;
	}

	public void setId_obstetrico(Integer id_obstetrico) {
		this.id_obstetrico = id_obstetrico;
	}

	public void setId_obs_parto(Integer id_obs_parto) {
		this.id_obs_parto = id_obs_parto;
	}

	@Override
	public String toString() {
		return "AntObsParto [id_paciente=" + id_paciente + ", via=" + via + ", nacidos_vivo=" + nacidos_vivo
				+ ", nacidos_muerto=" + nacidos_muerto + ", nacimientos=" + nacimientos + ", fuente_informacion="
				+ fuente_informacion + ", sensible=" + sensible + ", id_obstetrico=" + id_obstetrico + ", id_obs_parto="
				+ id_obs_parto + "]";
	}
	
}
