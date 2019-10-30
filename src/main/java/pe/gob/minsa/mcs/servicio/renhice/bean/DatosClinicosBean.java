package pe.gob.minsa.mcs.servicio.renhice.bean;

import java.io.Serializable;
import java.util.List;

import pe.gob.minsa.mcs.servicio.renhice.model.Antecedente;
import pe.gob.minsa.mcs.servicio.renhice.model.EpisodioClinico;
import pe.gob.minsa.mcs.servicio.renhice.model.IndicacionAlta;

public class DatosClinicosBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<EpisodioClinico> episodio_clinico;
	private Antecedente antecedentes;
	private IndicacionAlta indicaciones_alta;
	private String fechahora_envio;
	private String usuario_envio;
	private String token_registro;

	public DatosClinicosBean() {

	}

	public DatosClinicosBean(List<EpisodioClinico> episodio_clinico, Antecedente antecedentes,
			IndicacionAlta indicaciones_alta, String fechahora_envio, String usuario_envio,String token_registro) {
	
		this.episodio_clinico = episodio_clinico;
		this.antecedentes = antecedentes;
		this.indicaciones_alta = indicaciones_alta;
		this.fechahora_envio = fechahora_envio;
		this.usuario_envio = usuario_envio;
		this.token_registro = token_registro;
	}

	public List<EpisodioClinico> getEpisodio_clinico() {
		return episodio_clinico;
	}

	public Antecedente getAntecedentes() {
		return antecedentes;
	}

	public IndicacionAlta getIndicaciones_alta() {
		return indicaciones_alta;
	}

	public String getFechahora_envio() {
		return fechahora_envio;
	}

	public String getUsuario_envio() {
		return usuario_envio;
	}

	public void setEpisodio_clinico(List<EpisodioClinico> episodio_clinico) {
		this.episodio_clinico = episodio_clinico;
	}

	public void setAntecedentes(Antecedente antecedentes) {
		this.antecedentes = antecedentes;
	}

	public void setIndicaciones_alta(IndicacionAlta indicaciones_alta) {
		this.indicaciones_alta = indicaciones_alta;
	}

	public void setFechahora_envio(String fechahora_envio) {
		this.fechahora_envio = fechahora_envio;
	}

	public void setUsuario_envio(String usuario_envio) {
		this.usuario_envio = usuario_envio;
	}
	
	public String getToken_registro() {
		return token_registro;
	}

	public void setToken_registro(String token_registro) {
		this.token_registro = token_registro;
	}

	@Override
	public String toString() {
		return "DatosClinicosBean [episodio_clinico=" + episodio_clinico + ", antecedentes=" + antecedentes
				+ ", indicaciones_alta=" + indicaciones_alta + ", fechahora_envio=" + fechahora_envio
				+ ", usuario_envio=" + usuario_envio + ", token_registro=" + token_registro + "]";
	}
		

}
