package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;

public class DatosRespuesta implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String codigo_ipress;
	private String codigo_categoria_ipress;
	private String codigo_hce;
	private String token_registro;
	
	public DatosRespuesta() {
		
	}

	public DatosRespuesta(String codigo_ipress, String codigo_categoria_ipress, String codigo_hce,
			String token_registro) {
		super();
		this.codigo_ipress = codigo_ipress;
		this.codigo_categoria_ipress = codigo_categoria_ipress;
		this.codigo_hce = codigo_hce;
		this.token_registro = token_registro;
	}

	public String getCodigo_ipress() {
		return codigo_ipress;
	}

	public void setCodigo_ipress(String codigo_ipress) {
		this.codigo_ipress = codigo_ipress;
	}

	public String getCodigo_categoria_ipress() {
		return codigo_categoria_ipress;
	}

	public void setCodigo_categoria_ipress(String codigo_categoria_ipress) {
		this.codigo_categoria_ipress = codigo_categoria_ipress;
	}

	public String getCodigo_hce() {
		return codigo_hce;
	}

	public void setCodigo_hce(String codigo_hce) {
		this.codigo_hce = codigo_hce;
	}

	public String getToken_registro() {
		return token_registro;
	}

	public void setToken_registro(String token_registro) {
		this.token_registro = token_registro;
	}

	@Override
	public String toString() {
		return "DatosRespuesta [codigo_ipress=" + codigo_ipress + ", codigo_categoria_ipress=" + codigo_categoria_ipress
				+ ", codigo_hce=" + codigo_hce + ", token_registro=" + token_registro + "]";
	}

}
