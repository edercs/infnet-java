package br.edu.infnet.mypet.model.domain;

public abstract class Servico {
	private String porteAnimal;
	private Double preco;
	
	public String getPorteAnimal() {
		return porteAnimal;
	}
	public void setPorteAnimal(String porteAnimal) {
		this.porteAnimal = porteAnimal;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return porteAnimal + ";" +  preco;
	}
}
