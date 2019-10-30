package pe.gob.minsa.mcs.servicio.renhice.bean;

import java.io.Serializable;

import pe.gob.minsa.mcs.servicio.renhice.model.DatosIdentificativo;
import pe.gob.minsa.mcs.servicio.renhice.model.DatosPersonales;
import pe.gob.minsa.mcs.servicio.renhice.model.DatosPersonalesSensibles;
import pe.gob.minsa.mcs.servicio.renhice.model.DatosPrestacionSalud;

public class RequestBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String fechahora_envio;
	private String usuario_envio;
	private DatosPrestacionSalud datos_prestacion_salud;
	private DatosIdentificativo datos_identificativo;
	private DatosPersonales datos_personales;
	private DatosPersonalesSensibles datos_personales_sensibles;
	
	public RequestBean() {
		
	}

	public RequestBean(String fechahora_envio, String usuario_envio, DatosPrestacionSalud datos_prestacion_salud,
			DatosIdentificativo datos_identificativo, DatosPersonales datos_personales,
			DatosPersonalesSensibles datos_personales_sensibles) {
		super();
		this.fechahora_envio = fechahora_envio;
		this.usuario_envio = usuario_envio;
		this.datos_prestacion_salud = datos_prestacion_salud;
		this.datos_identificativo = datos_identificativo;
		this.datos_personales = datos_personales;
		this.datos_personales_sensibles = datos_personales_sensibles;
	}

	public String getFechahora_envio() {
		return fechahora_envio;
	}

	public void setFechahora_envio(String fechahora_envio) {
		this.fechahora_envio = fechahora_envio;
	}

	public String getUsuario_envio() {
		return usuario_envio;
	}

	public void setUsuario_envio(String usuario_envio) {
		this.usuario_envio = usuario_envio;
	}

	public DatosPrestacionSalud getDatos_prestacion_salud() {
		return datos_prestacion_salud;
	}

	public void setDatos_prestacion_salud(DatosPrestacionSalud datos_prestacion_salud) {
		this.datos_prestacion_salud = datos_prestacion_salud;
	}

	public DatosIdentificativo getDatos_identificativo() {
		return datos_identificativo;
	}

	public void setDatos_identificativo(DatosIdentificativo datos_identificativo) {
		this.datos_identificativo = datos_identificativo;
	}

	public DatosPersonales getDatos_personales() {
		return datos_personales;
	}

	public void setDatos_personales(DatosPersonales datos_personales) {
		this.datos_personales = datos_personales;
	}

	public DatosPersonalesSensibles getDatos_personales_sensibles() {
		return datos_personales_sensibles;
	}

	public void setDatos_personales_sensibles(DatosPersonalesSensibles datos_personales_sensibles) {
		this.datos_personales_sensibles = datos_personales_sensibles;
	}

	@Override
	public String toString() {
		return "RequestBean [fechahora_envio=" + fechahora_envio + ", usuario_envio=" + usuario_envio
				+ ", datos_prestacion_salud=" + datos_prestacion_salud + ", datos_identificativo="
				+ datos_identificativo + ", datos_personales=" + datos_personales + ", datos_personales_sensibles="
				+ datos_personales_sensibles + "]";
	}
	
}
