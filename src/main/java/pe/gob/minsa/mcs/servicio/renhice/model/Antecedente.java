package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;
import java.util.List;

public class Antecedente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<AntDefinitivo> definitivos;
	private List<AntAdversaMedicamento> adversa_medicamentos;
	private List<AntTipoAdversaMedicamento> tipo_adversa_medicamentos;
	private List<AntEpidemiologico> epidemiologicos;
	private List<AntSocial> sociales;
	private List<AntAlergia> alergias;
	private AntObstetrico obstetricos;
	private AntInmunizacion inmunizaciones;
	private List<AntIntervencionQuirurgica> intervenciones_quirurgicas;
	private List<AntHospitalizacionPrevia> hospitalizaciones_previas;
	private List<AntMedicacionHabitual> medicacion_habitual;
	private List<AntfamiliarConsanguineidad> familiares_2do_consanguineidad;
			
	public Antecedente() {
		
	}

	public Antecedente(List<AntDefinitivo> definitivos, List<AntAdversaMedicamento> adversa_medicamentos,
			List<AntTipoAdversaMedicamento> tipo_adversa_medicamentos, List<AntEpidemiologico> epidemiologicos,
			List<AntSocial> sociales, List<AntAlergia> alergias, AntObstetrico obstetricos,
			AntInmunizacion inmunizaciones, List<AntIntervencionQuirurgica> intervenciones_quirurgicas,
			List<AntHospitalizacionPrevia> hospitalizaciones_previas, List<AntMedicacionHabitual> medicacion_habitual,
			List<AntfamiliarConsanguineidad> familiares_2do_consanguineidad) {
		
		this.definitivos = definitivos;
		this.adversa_medicamentos = adversa_medicamentos;
		this.tipo_adversa_medicamentos = tipo_adversa_medicamentos;
		this.epidemiologicos = epidemiologicos;
		this.sociales = sociales;
		this.alergias = alergias;
		this.obstetricos = obstetricos;
		this.inmunizaciones = inmunizaciones;
		this.intervenciones_quirurgicas = intervenciones_quirurgicas;
		this.hospitalizaciones_previas = hospitalizaciones_previas;
		this.medicacion_habitual = medicacion_habitual;
		this.familiares_2do_consanguineidad = familiares_2do_consanguineidad;
	}

	public List<AntDefinitivo> getDefinitivos() {
		return definitivos;
	}

	public List<AntAdversaMedicamento> getAdversa_medicamentos() {
		return adversa_medicamentos;
	}

	public List<AntTipoAdversaMedicamento> getTipo_adversa_medicamentos() {
		return tipo_adversa_medicamentos;
	}

	public List<AntEpidemiologico> getEpidemiologicos() {
		return epidemiologicos;
	}

	public List<AntSocial> getSociales() {
		return sociales;
	}

	public List<AntAlergia> getAlergias() {
		return alergias;
	}

	public AntObstetrico getObstetricos() {
		return obstetricos;
	}

	public AntInmunizacion getInmunizaciones() {
		return inmunizaciones;
	}

	public List<AntIntervencionQuirurgica> getIntervenciones_quirurgicas() {
		return intervenciones_quirurgicas;
	}

	public List<AntHospitalizacionPrevia> getHospitalizaciones_previas() {
		return hospitalizaciones_previas;
	}

	public List<AntMedicacionHabitual> getMedicacion_habitual() {
		return medicacion_habitual;
	}

	public List<AntfamiliarConsanguineidad> getFamiliares_2do_consanguineidad() {
		return familiares_2do_consanguineidad;
	}

	public void setDefinitivos(List<AntDefinitivo> definitivos) {
		this.definitivos = definitivos;
	}

	public void setAdversa_medicamentos(List<AntAdversaMedicamento> adversa_medicamentos) {
		this.adversa_medicamentos = adversa_medicamentos;
	}

	public void setTipo_adversa_medicamentos(List<AntTipoAdversaMedicamento> tipo_adversa_medicamentos) {
		this.tipo_adversa_medicamentos = tipo_adversa_medicamentos;
	}

	public void setEpidemiologicos(List<AntEpidemiologico> epidemiologicos) {
		this.epidemiologicos = epidemiologicos;
	}

	public void setSociales(List<AntSocial> sociales) {
		this.sociales = sociales;
	}

	public void setAlergias(List<AntAlergia> alergias) {
		this.alergias = alergias;
	}

	public void setObstetricos(AntObstetrico obstetricos) {
		this.obstetricos = obstetricos;
	}

	public void setInmunizaciones(AntInmunizacion inmunizaciones) {
		this.inmunizaciones = inmunizaciones;
	}

	public void setIntervenciones_quirurgicas(List<AntIntervencionQuirurgica> intervenciones_quirurgicas) {
		this.intervenciones_quirurgicas = intervenciones_quirurgicas;
	}

	public void setHospitalizaciones_previas(List<AntHospitalizacionPrevia> hospitalizaciones_previas) {
		this.hospitalizaciones_previas = hospitalizaciones_previas;
	}

	public void setMedicacion_habitual(List<AntMedicacionHabitual> medicacion_habitual) {
		this.medicacion_habitual = medicacion_habitual;
	}

	public void setFamiliares_2do_consanguineidad(List<AntfamiliarConsanguineidad> familiares_2do_consanguineidad) {
		this.familiares_2do_consanguineidad = familiares_2do_consanguineidad;
	}

	@Override
	public String toString() {
		return "Antecedente [definitivos=" + definitivos + ", adversa_medicamentos=" + adversa_medicamentos
				+ ", tipo_adversa_medicamentos=" + tipo_adversa_medicamentos + ", epidemiologicos=" + epidemiologicos
				+ ", sociales=" + sociales + ", alergias=" + alergias + ", obstetricos=" + obstetricos
				+ ", inmunizaciones=" + inmunizaciones + ", intervenciones_quirurgicas=" + intervenciones_quirurgicas
				+ ", hospitalizaciones_previas=" + hospitalizaciones_previas + ", medicacion_habitual="
				+ medicacion_habitual + ", familiares_2do_consanguineidad=" + familiares_2do_consanguineidad + "]";
	}

			
}
