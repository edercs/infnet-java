package br.edu.infnet.mypet.model.domain;

public class Consulta extends Servico {

	private String porteAnimal;
	private String raca;
	private Double preco;
	
	
	public String getPorteAnimal() {
		return porteAnimal;
	}
	public void setPorteAnimal(String porteAnimal) {
		this.porteAnimal = porteAnimal;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return porteAnimal + ";" + raca + ";" +  preco;
	}
}
