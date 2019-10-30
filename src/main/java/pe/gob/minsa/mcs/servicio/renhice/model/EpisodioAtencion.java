package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class EpisodioAtencion implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonIgnore
	private Integer id_episodio_atencion;
	@JsonIgnore
	private Integer id_episodio_clinico;
	private String codigo_episodio_atencion;
	private String fecha_inicio_episodio_atencion;
	private String hora_inicio_episodio_atencion;
	private String fecha_cierre_episodio_atencion;
	private String hora_cierre_episodio_atencion;
	private String id_personal_atiende;
	private List<Diagnostico> diagnosticos;
	private PlanTrabajo plan_trabajo;
	private Tratamiento tratamiento;

	public EpisodioAtencion() {

	}

	public EpisodioAtencion(Integer id_episodio_atencion, Integer id_episodio_clinico, String codigo_episodio_atencion,
			String fecha_inicio_episodio_atencion, String hora_inicio_episodio_atencion,
			String fecha_cierre_episodio_atencion, String hora_cierre_episodio_atencion, String id_personal_atiende,
			List<Diagnostico> diagnosticos, PlanTrabajo plan_trabajo, Tratamiento tratamiento) {

		this.id_episodio_atencion = id_episodio_atencion;
		this.id_episodio_clinico = id_episodio_clinico;
		this.codigo_episodio_atencion = codigo_episodio_atencion;
		this.fecha_inicio_episodio_atencion = fecha_inicio_episodio_atencion;
		this.hora_inicio_episodio_atencion = hora_inicio_episodio_atencion;
		this.fecha_cierre_episodio_atencion = fecha_cierre_episodio_atencion;
		this.hora_cierre_episodio_atencion = hora_cierre_episodio_atencion;
		this.id_personal_atiende = id_personal_atiende;
		this.diagnosticos = diagnosticos;
		this.plan_trabajo = plan_trabajo;
		this.tratamiento = tratamiento;
	}

	public Integer getId_episodio_atencion() {
		return id_episodio_atencion;
	}

	public Integer getId_episodio_clinico() {
		return id_episodio_clinico;
	}

	public String getCodigo_episodio_atencion() {
		return codigo_episodio_atencion;
	}

	public String getFecha_inicio_episodio_atencion() {
		return fecha_inicio_episodio_atencion;
	}

	public String getHora_inicio_episodio_atencion() {
		return hora_inicio_episodio_atencion;
	}

	public String getFecha_cierre_episodio_atencion() {
		return fecha_cierre_episodio_atencion;
	}

	public String getHora_cierre_episodio_atencion() {
		return hora_cierre_episodio_atencion;
	}

	public String getId_personal_atiende() {
		return id_personal_atiende;
	}

	public void setId_episodio_atencion(Integer id_episodio_atencion) {
		this.id_episodio_atencion = id_episodio_atencion;
	}

	public void setId_episodio_clinico(Integer id_episodio_clinico) {
		this.id_episodio_clinico = id_episodio_clinico;
	}

	public void setCodigo_episodio_atencion(String codigo_episodio_atencion) {
		this.codigo_episodio_atencion = codigo_episodio_atencion;
	}

	public void setFecha_inicio_episodio_atencion(String fecha_inicio_episodio_atencion) {
		this.fecha_inicio_episodio_atencion = fecha_inicio_episodio_atencion;
	}

	public void setHora_inicio_episodio_atencion(String hora_inicio_episodio_atencion) {
		this.hora_inicio_episodio_atencion = hora_inicio_episodio_atencion;
	}

	public void setFecha_cierre_episodio_atencion(String fecha_cierre_episodio_atencion) {
		this.fecha_cierre_episodio_atencion = fecha_cierre_episodio_atencion;
	}

	public void setHora_cierre_episodio_atencion(String hora_cierre_episodio_atencion) {
		this.hora_cierre_episodio_atencion = hora_cierre_episodio_atencion;
	}

	public void setId_personal_atiende(String id_personal_atiende) {
		this.id_personal_atiende = id_personal_atiende;
	}

	public List<Diagnostico> getDiagnosticos() {
		return diagnosticos;
	}

	public PlanTrabajo getPlan_trabajo() {
		return plan_trabajo;
	}

	public Tratamiento getTratamiento() {
		return tratamiento;
	}

	public void setDiagnosticos(List<Diagnostico> diagnosticos) {
		this.diagnosticos = diagnosticos;
	}

	public void setPlan_trabajo(PlanTrabajo plan_trabajo) {
		this.plan_trabajo = plan_trabajo;
	}

	public void setTratamiento(Tratamiento tratamiento) {
		this.tratamiento = tratamiento;
	}

	@Override
	public String toString() {
		return "EpisodioAtencion [id_episodio_atencion=" + id_episodio_atencion + ", id_episodio_clinico="
				+ id_episodio_clinico + ", codigo_episodio_atencion=" + codigo_episodio_atencion
				+ ", fecha_inicio_episodio_atencion=" + fecha_inicio_episodio_atencion
				+ ", hora_inicio_episodio_atencion=" + hora_inicio_episodio_atencion
				+ ", fecha_cierre_episodio_atencion=" + fecha_cierre_episodio_atencion
				+ ", hora_cierre_episodio_atencion=" + hora_cierre_episodio_atencion + ", id_personal_atiende="
				+ id_personal_atiende + ", diagnosticos=" + diagnosticos + ", plan_trabajo=" + plan_trabajo
				+ ", tratamiento=" + tratamiento + "]";
	}

}
