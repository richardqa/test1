package pe.gob.minsa.mcs.servicio.renhice.dao.impl;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;

import pe.gob.minsa.mcs.servicio.renhice.bean.DatosClinicosBean;
import pe.gob.minsa.mcs.servicio.renhice.dao.RegistraDatosClinicosDao;

@Repository
public class RegistraDatosClinicosDaoImpl extends JdbcDaoSupport implements RegistraDatosClinicosDao{
	
	public RegistraDatosClinicosDaoImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
		
	}
	
	@Override
	public String registraDatosClinicos(DatosClinicosBean datosClinicosBean) {
		
		String codigo = "";
		String mensaje = "";
				
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(datosClinicosBean);					
			System.out.println(json);
			String sql = "select * FROM servicioweb.sp_actualiza_hce_renhice('"+json+"')";	
						
			Map<String, Object> result = getJdbcTemplate().queryForMap(sql);
			
			codigo = (String) result.get("v_codigo");
			mensaje = (String) result.get("v_des");
			
			logger.debug("::: Mensajes del SP :::---> "+mensaje);
			
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			codigo = "9000";
		}
		return codigo;
	}
	

}
