package pe.gob.minsa.mcs.servicio.renhice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.minsa.mcs.servicio.renhice.bean.RequestBean;
import pe.gob.minsa.mcs.servicio.renhice.bean.ResponseBean;
import pe.gob.minsa.mcs.servicio.renhice.dao.impl.RegistrosihceDaoImpl;
import pe.gob.minsa.mcs.servicio.renhice.service.RegistrosihceService;
import pe.gob.minsa.mcs.servicio.renhice.util.Util;

@Service
public class RegistrosihceServiceImpl implements RegistrosihceService{

	@Autowired
	private RegistrosihceDaoImpl registrosihceDao;
	  
	@Override
	public ResponseBean registraHce(RequestBean requestBean) {
		
		ResponseBean response = new ResponseBean();
		Util validador = new Util();
		String respuesta = null;
		boolean validaenvio = true;
		
		try {
			
			respuesta = validador.validaDatosEntrada(requestBean);
			
			if(respuesta.equals("0000")) {
				
				validaenvio = registrosihceDao.validaEnvio(requestBean);
				System.out.println(validaenvio);
				
				if(validaenvio == true) {
					response = registrosihceDao.registraHce(requestBean);
					System.out.println(response.toString());
					
				}else {
					response.setCodigo("0106");
				}
			
			}else {				
				response.setCodigo(respuesta);				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return response;
	}

}
