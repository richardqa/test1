package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;
import java.util.List;

public class PlanTrabajo implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<PlanExamenAuxiliarLaboratorio> examenes_auxiliares_laboratorio;
	private List<PlanExamenAuxiliarImagen> examenes_auxiliares_imagenes;
	private List<PlanRespuestaInterconsulta> respuesta_interconsulta;
	private List<PlanEnfermedadRam> enfermedades_ram;
	private List<PlanMotivoReferencia> motivo_referencia;
	private List<PlanMotivoContrareferencia> motivo_contrareferencia;
	private List<PlanMotivoTelemedicina> motivo_telemedicina;
	private List<PlanRespuestaTelemedicina> respuesta_telemedicina;
	private PlanResultadoExamenLaboratorio resultado_examenes_laboratorio;

	public PlanTrabajo() {

	}

	public PlanTrabajo(List<PlanExamenAuxiliarLaboratorio> examenes_auxiliares_laboratorio,
			List<PlanExamenAuxiliarImagen> examenes_auxiliares_imagenes,
			List<PlanRespuestaInterconsulta> respuesta_interconsulta, List<PlanEnfermedadRam> enfermedades_ram,
			List<PlanMotivoReferencia> motivo_referencia, List<PlanMotivoContrareferencia> motivo_contrareferencia,
			List<PlanMotivoTelemedicina> motivo_telemedicina, List<PlanRespuestaTelemedicina> respuesta_telemedicina,
			PlanResultadoExamenLaboratorio resultado_examenes_laboratorio) {
		super();
		this.examenes_auxiliares_laboratorio = examenes_auxiliares_laboratorio;
		this.examenes_auxiliares_imagenes = examenes_auxiliares_imagenes;
		this.respuesta_interconsulta = respuesta_interconsulta;
		this.enfermedades_ram = enfermedades_ram;
		this.motivo_referencia = motivo_referencia;
		this.motivo_contrareferencia = motivo_contrareferencia;
		this.motivo_telemedicina = motivo_telemedicina;
		this.respuesta_telemedicina = respuesta_telemedicina;
		this.resultado_examenes_laboratorio = resultado_examenes_laboratorio;
	}

	public List<PlanExamenAuxiliarLaboratorio> getExamenes_auxiliares_laboratorio() {
		return examenes_auxiliares_laboratorio;
	}

	public List<PlanExamenAuxiliarImagen> getExamenes_auxiliares_imagenes() {
		return examenes_auxiliares_imagenes;
	}

	public List<PlanRespuestaInterconsulta> getRespuesta_interconsulta() {
		return respuesta_interconsulta;
	}

	public List<PlanEnfermedadRam> getEnfermedades_ram() {
		return enfermedades_ram;
	}

	public List<PlanMotivoReferencia> getMotivo_referencia() {
		return motivo_referencia;
	}

	public List<PlanMotivoContrareferencia> getMotivo_contrareferencia() {
		return motivo_contrareferencia;
	}

	public List<PlanMotivoTelemedicina> getMotivo_telemedicina() {
		return motivo_telemedicina;
	}

	public List<PlanRespuestaTelemedicina> getRespuesta_telemedicina() {
		return respuesta_telemedicina;
	}

	public PlanResultadoExamenLaboratorio getResultado_examenes_laboratorio() {
		return resultado_examenes_laboratorio;
	}

	public void setExamenes_auxiliares_laboratorio(List<PlanExamenAuxiliarLaboratorio> examenes_auxiliares_laboratorio) {
		this.examenes_auxiliares_laboratorio = examenes_auxiliares_laboratorio;
	}

	public void setExamenes_auxiliares_imagenes(List<PlanExamenAuxiliarImagen> examenes_auxiliares_imagenes) {
		this.examenes_auxiliares_imagenes = examenes_auxiliares_imagenes;
	}

	public void setRespuesta_interconsulta(List<PlanRespuestaInterconsulta> respuesta_interconsulta) {
		this.respuesta_interconsulta = respuesta_interconsulta;
	}

	public void setEnfermedades_ram(List<PlanEnfermedadRam> enfermedades_ram) {
		this.enfermedades_ram = enfermedades_ram;
	}

	public void setMotivo_referencia(List<PlanMotivoReferencia> motivo_referencia) {
		this.motivo_referencia = motivo_referencia;
	}

	public void setMotivo_contrareferencia(List<PlanMotivoContrareferencia> motivo_contrareferencia) {
		this.motivo_contrareferencia = motivo_contrareferencia;
	}

	public void setMotivo_telemedicina(List<PlanMotivoTelemedicina> motivo_telemedicina) {
		this.motivo_telemedicina = motivo_telemedicina;
	}

	public void setRespuesta_telemedicina(List<PlanRespuestaTelemedicina> respuesta_telemedicina) {
		this.respuesta_telemedicina = respuesta_telemedicina;
	}

	public void setResultado_examenes_laboratorio(PlanResultadoExamenLaboratorio resultado_examenes_laboratorio) {
		this.resultado_examenes_laboratorio = resultado_examenes_laboratorio;
	}

	@Override
	public String toString() {
		return "PlanTrabajo [examenes_auxiliares_laboratorio=" + examenes_auxiliares_laboratorio
				+ ", examenes_auxiliares_imagenes=" + examenes_auxiliares_imagenes + ", respuesta_interconsulta="
				+ respuesta_interconsulta + ", enfermedades_ram=" + enfermedades_ram + ", motivo_referencia="
				+ motivo_referencia + ", motivo_contrareferencia=" + motivo_contrareferencia + ", motivo_telemedicina="
				+ motivo_telemedicina + ", respuesta_telemedicina=" + respuesta_telemedicina
				+ ", resultado_examenes_laboratorio=" + resultado_examenes_laboratorio + "]";
	}

}
