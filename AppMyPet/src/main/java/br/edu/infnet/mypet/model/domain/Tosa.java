package br.edu.infnet.mypet.model.domain;

public class Tosa extends Servico {

	private int tipoTosa;
	
	public int getTipoTosa() {
		return tipoTosa;
	}
	public void setTipoTosa(int tipoTosa) {
		this.tipoTosa = tipoTosa;
	}
	
	@Override
	public String toString() {
		return super.toString() + ";" + tipoTosa;
	}
}
