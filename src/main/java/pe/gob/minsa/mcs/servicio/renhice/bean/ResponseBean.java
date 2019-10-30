package pe.gob.minsa.mcs.servicio.renhice.bean;

import java.io.Serializable;

import pe.gob.minsa.mcs.servicio.renhice.model.DatosRespuesta;

public class ResponseBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String codigo;
	private DatosRespuesta datos;

	public ResponseBean() {

	}

	public ResponseBean(String codigo, DatosRespuesta datos) {
		super();
		this.codigo = codigo;
		this.datos = datos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public DatosRespuesta getDatos() {
		return datos;
	}

	public void setDatos(DatosRespuesta datos) {
		this.datos = datos;
	}

	@Override
	public String toString() {
		return "ResponseBean [codigo=" + codigo + ", datos=" + datos + "]";
	}

}
