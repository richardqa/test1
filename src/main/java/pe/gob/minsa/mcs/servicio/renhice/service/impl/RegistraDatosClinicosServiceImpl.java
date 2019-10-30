package pe.gob.minsa.mcs.servicio.renhice.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.minsa.mcs.servicio.renhice.bean.DatosClinicosBean;
import pe.gob.minsa.mcs.servicio.renhice.dao.RegistraDatosClinicosDao;
import pe.gob.minsa.mcs.servicio.renhice.service.RegistraDatosClinicosService;

@Service
public class RegistraDatosClinicosServiceImpl implements RegistraDatosClinicosService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private RegistraDatosClinicosDao _registrarDatosClinicosDao;

	@Override
	public String registraDatosClinicos(DatosClinicosBean datosClinicosBean) {
		String codigo = "";

		codigo = _registrarDatosClinicosDao.registraDatosClinicos(datosClinicosBean);

		try {

		} catch (Exception e) {
			logger.error(e.getMessage());
			codigo = "9000";
		}
		return codigo;
	}

}
