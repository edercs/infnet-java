package br.edu.infnet.mypet.model.domain;

public class Consulta extends Servico {

	private String raca;
	
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + ";" + raca;
	}
}
