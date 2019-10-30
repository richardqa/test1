package pe.gob.minsa.mcs.servicio.renhice.dao;

import pe.gob.minsa.mcs.servicio.renhice.bean.RequestBean;
import pe.gob.minsa.mcs.servicio.renhice.bean.ResponseBean;

public interface RegistrosihceDao {
	
	ResponseBean registraHce(RequestBean requestBean);
	
}
