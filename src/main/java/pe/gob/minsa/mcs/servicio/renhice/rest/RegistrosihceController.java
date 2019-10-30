package pe.gob.minsa.mcs.servicio.renhice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import pe.gob.minsa.mcs.servicio.renhice.bean.DatosClinicosBean;
import pe.gob.minsa.mcs.servicio.renhice.bean.DatosClinicosResponseBean;
import pe.gob.minsa.mcs.servicio.renhice.service.RegistraDatosClinicosService;

@RestController
@RequestMapping("/servicio/v1.0")
@Api(value = "registrahce", description = "Interfaces para el registro de datos en renhice")
public class RegistrosihceController {

//	@Autowired
	//private RegistrosihceServiceImpl registrosihceService;
	@Autowired
	private RegistraDatosClinicosService _registraDatosClinicosService;
/*
	@PostMapping(value = "/registro", produces = "application/json; charset=UTF-8")
	public ResponseBean consultaInmunizaciones(@RequestBody RequestBean requestBean) {
		ResponseBean response = new ResponseBean();
		
		response = registrosihceService.registraHce(requestBean);		
		return response;
	}
*/	
	@PostMapping(value = "/enviar-datos", produces = "application/json; charset=UTF-8")
	public DatosClinicosResponseBean  enviarDatos(@RequestBody DatosClinicosBean datosClinicosBean) {
		
		DatosClinicosResponseBean response = new DatosClinicosResponseBean();		
		response.setCodigo(_registraDatosClinicosService.registraDatosClinicos(datosClinicosBean));		
		return response;
	}

}
