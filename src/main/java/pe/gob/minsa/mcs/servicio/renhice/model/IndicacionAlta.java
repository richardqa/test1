package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class IndicacionAlta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Integer id_ind_alta;
	private String condicion_egreso;
	private String fecha_proxima_cita;
	private List<IndAltaDiagEgreso> diagnostico_egreso;
	private List<MedicamentoPrescrito> medicamento_prescrito;
	
	public IndicacionAlta() {
		
	}
	
	public IndicacionAlta(Integer id_ind_alta, String condicion_egreso, String fecha_proxima_cita,
			List<IndAltaDiagEgreso> diagnostico_egreso, List<MedicamentoPrescrito> medicamento_prescrito) {

		this.id_ind_alta = id_ind_alta;
		this.condicion_egreso = condicion_egreso;
		this.fecha_proxima_cita = fecha_proxima_cita;
		this.diagnostico_egreso = diagnostico_egreso;
		this.medicamento_prescrito = medicamento_prescrito;
	}

	public Integer getId_ind_alta() {
		return id_ind_alta;
	}

	public String getCondicion_egreso() {
		return condicion_egreso;
	}

	public String getFecha_proxima_cita() {
		return fecha_proxima_cita;
	}

	public List<IndAltaDiagEgreso> getDiagnostico_egreso() {
		return diagnostico_egreso;
	}

	public List<MedicamentoPrescrito> getMedicamento_prescrito() {
		return medicamento_prescrito;
	}

	public void setId_ind_alta(Integer id_ind_alta) {
		this.id_ind_alta = id_ind_alta;
	}

	public void setCondicion_egreso(String condicion_egreso) {
		this.condicion_egreso = condicion_egreso;
	}

	public void setFecha_proxima_cita(String fecha_proxima_cita) {
		this.fecha_proxima_cita = fecha_proxima_cita;
	}

	public void setDiagnostico_egreso(List<IndAltaDiagEgreso> diagnostico_egreso) {
		this.diagnostico_egreso = diagnostico_egreso;
	}

	public void setMedicamento_prescrito(List<MedicamentoPrescrito> medicamento_prescrito) {
		this.medicamento_prescrito = medicamento_prescrito;
	}

	@Override
	public String toString() {
		return "IndicacionAlta [id_ind_alta=" + id_ind_alta + ", condicion_egreso=" + condicion_egreso
				+ ", fecha_proxima_cita=" + fecha_proxima_cita + ", diagnostico_egreso=" + diagnostico_egreso
				+ ", medicamento_prescrito=" + medicamento_prescrito + "]";
	}
	
}
