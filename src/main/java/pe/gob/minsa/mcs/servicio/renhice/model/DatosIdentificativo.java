package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

public class DatosIdentificativo implements Serializable{

	private static final long serialVersionUID = 1L;

	private String tipo_documento;
	private String numero_documento;
	private String primer_apellido;
	private String segundo_apellido;
	private String apellido_casada;
	private String nombres;
	
	public DatosIdentificativo() {
		
	}

	public DatosIdentificativo(String tipo_documento, String numero_documento, String primer_apellido,
			String segundo_apellido, String apellido_casada, String nombres) {
		super();
		this.tipo_documento = tipo_documento;
		this.numero_documento = numero_documento;
		this.primer_apellido = primer_apellido;
		this.segundo_apellido = segundo_apellido;
		this.apellido_casada = apellido_casada;
		this.nombres = nombres;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public String getNumero_documento() {
		return numero_documento;
	}

	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}

	public String getPrimer_apellido() {
		return primer_apellido;
	}

	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}

	public String getSegundo_apellido() {
		return segundo_apellido;
	}

	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}

	public String getApellido_casada() {
		return apellido_casada;
	}

	public void setApellido_casada(String apellido_casada) {
		this.apellido_casada = apellido_casada;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	@Override
	public String toString() {
		return "DatosIdentificativo [tipo_documento=" + tipo_documento + ", numero_documento=" + numero_documento
				+ ", primer_apellido=" + primer_apellido + ", segundo_apellido=" + segundo_apellido
				+ ", apellido_casada=" + apellido_casada + ", nombres=" + nombres + "]";
	}
	
}
