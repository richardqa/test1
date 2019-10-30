package pe.gob.minsa.mcs.servicio.renhice.util;

import java.text.SimpleDateFormat;

import pe.gob.minsa.mcs.servicio.renhice.bean.RequestBean;

public class Util {

	public String validaDatosEntrada(RequestBean requestBean) {

		String respuesta = "0000";

		try {

			if (requestBean.getDatos_prestacion_salud().getCodigo_ipress() == null
					|| "".equals(requestBean.getDatos_prestacion_salud().getCodigo_ipress())) {
				
				respuesta = "0100";
				
			}else if(requestBean.getDatos_prestacion_salud().getCodigo_categoria_ipress() == null
					|| "".equals(requestBean.getDatos_prestacion_salud().getCodigo_categoria_ipress())){
				
				respuesta = "0101";
				
			}else if(requestBean.getDatos_prestacion_salud().getCodigo_hce() == null
					|| "".equals(requestBean.getDatos_prestacion_salud().getCodigo_hce())) {
				
				respuesta = "0102";
				
			}else if(requestBean.getFechahora_envio() == null
					|| "".equals(requestBean.getFechahora_envio())){
				
				respuesta = "0103";
				
			}else if(validaFecha(requestBean.getFechahora_envio()) == false){
				
				respuesta = "0104";
				
			}else if(requestBean.getUsuario_envio() == null
					|| "".equals(requestBean.getUsuario_envio())){
				
				respuesta = "0105";
				
			}else {
				respuesta = "0000";
			}

		} catch (Exception e) {
			e.printStackTrace();
			respuesta = "9000";
		}
		return respuesta;
	}
	
    public boolean validaFecha(String fecha) {
    	
    	try {
			SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
			formato.setLenient(false);
			formato.parse(fecha);			
		} catch (Exception e) {
			return false;
		}
    	
    	return true;
    }
}
