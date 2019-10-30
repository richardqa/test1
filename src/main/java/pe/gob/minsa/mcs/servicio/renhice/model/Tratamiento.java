package pe.gob.minsa.mcs.servicio.renhice.model;

import java.io.Serializable;
import java.util.List;

public class Tratamiento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<TratamientoMedicamento> medicamento;
	private List<TratamientoMedicamentoControlado> medicamento_controlado;
	
	public Tratamiento() {
		
	}

	public Tratamiento(List<TratamientoMedicamento> medicamento,
			List<TratamientoMedicamentoControlado> medicamento_controlado) {
	
		this.medicamento = medicamento;
		this.medicamento_controlado = medicamento_controlado;
	}

	public List<TratamientoMedicamento> getMedicamento() {
		return medicamento;
	}

	public List<TratamientoMedicamentoControlado> getMedicamento_controlado() {
		return medicamento_controlado;
	}

	public void setMedicamento(List<TratamientoMedicamento> medicamento) {
		this.medicamento = medicamento;
	}

	public void setMedicamento_controlado(List<TratamientoMedicamentoControlado> medicamento_controlado) {
		this.medicamento_controlado = medicamento_controlado;
	}

	@Override
	public String toString() {
		return "Tratamiento [medicamento=" + medicamento + ", medicamento_controlado=" + medicamento_controlado + "]";
	}
	
}
