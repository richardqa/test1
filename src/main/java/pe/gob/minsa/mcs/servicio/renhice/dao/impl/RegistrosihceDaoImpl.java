package pe.gob.minsa.mcs.servicio.renhice.dao.impl;

import java.sql.Types;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import pe.gob.minsa.mcs.servicio.renhice.bean.RequestBean;
import pe.gob.minsa.mcs.servicio.renhice.bean.ResponseBean;
import pe.gob.minsa.mcs.servicio.renhice.dao.RegistrosihceDao;
import pe.gob.minsa.mcs.servicio.renhice.model.DatosRespuesta;

@Repository
public class RegistrosihceDaoImpl extends JdbcDaoSupport implements RegistrosihceDao {

	public RegistrosihceDaoImpl(DataSource datasource) {
		this.setDataSource(datasource);
	}

	@Override
	public ResponseBean registraHce(RequestBean requestBean) {
		
		ResponseBean response = new ResponseBean();
		DatosRespuesta datos = new DatosRespuesta();
		
		int numreg = 0;

		String KEY = "estaeslallaveparagenerarlaclaveydebesersecretaotodopuedetenerconsecuencias";
		Long tiempo = System.currentTimeMillis();
		String token = Jwts.builder().signWith(SignatureAlgorithm.HS256, KEY).setSubject("Kevin Daniel")
				.setIssuedAt(new Date(tiempo)).setExpiration(new Date(tiempo + 900000))
				.claim("email", "kpinchi@minsa.gob.pe").compact();

		System.out.println("El token generado es : " + token);

		String sql = " INSERT INTO registro_renhice(fechahora_envio, usuario_envio, codigo_ipress, codigo_categoria_ipress, codigo_hce, tipo_documento, numero_documento, primer_apellido, segundo_apellido, apellido_casada, nombres, codigo_pais, ubigeo_nacimiento, fecha_nacimiento, codigo_sexo, grupo_sanguineo, factor_rh, token_registro) "
				+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";

		try {

			Object[] parametros = new Object[] { requestBean.getFechahora_envio(), requestBean.getUsuario_envio(),
					requestBean.getDatos_prestacion_salud().getCodigo_ipress(),
					requestBean.getDatos_prestacion_salud().getCodigo_categoria_ipress(),
					requestBean.getDatos_prestacion_salud().getCodigo_hce(),
					requestBean.getDatos_identificativo().getTipo_documento(),
					requestBean.getDatos_identificativo().getNumero_documento(),
					requestBean.getDatos_identificativo().getPrimer_apellido(),
					requestBean.getDatos_identificativo().getSegundo_apellido(),
					requestBean.getDatos_identificativo().getApellido_casada(),
					requestBean.getDatos_identificativo().getNombres(),
					requestBean.getDatos_personales().getCodigo_pais(),
					requestBean.getDatos_personales().getUbigeo_nacimiento(),
					requestBean.getDatos_personales().getFecha_nacimiento(),
					requestBean.getDatos_personales().getCodigo_sexo(),
					requestBean.getDatos_personales_sensibles().getGrupo_sanguineo(),
					requestBean.getDatos_personales_sensibles().getFactor_rh(), token

			};

			int[] tipos = new int[] {

					Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR,
					Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR,
					Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR

			};

			numreg = getJdbcTemplate().update(sql, parametros, tipos);

			//System.out.println("Se han insertado " + numreg + " registro a la base de datos");

			response.setCodigo("0000");
			
			datos.setCodigo_ipress(requestBean.getDatos_prestacion_salud().getCodigo_ipress());
			datos.setCodigo_hce(requestBean.getDatos_prestacion_salud().getCodigo_hce());
			datos.setCodigo_categoria_ipress(requestBean.getDatos_prestacion_salud().getCodigo_categoria_ipress());
			datos.setToken_registro(token);
			
			response.setDatos(datos);
			
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}

		return response;
	}

	public boolean validaEnvio(RequestBean requestBean) {
		
		boolean valida = true;
		
		String sql = " select count(*) from registro_renhice where codigo_ipress = '"+requestBean.getDatos_prestacion_salud().getCodigo_ipress()+"' and codigo_hce = '"+requestBean.getDatos_prestacion_salud().getCodigo_hce()+"'";
		
		int count = 0;
		
		try {			
			
			count = getJdbcTemplate().queryForObject(sql, Integer.class);
			
			if(count > 0) {
				
				valida = false;
				
			}else {
				valida = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return valida;
	}

}
