package br.edu.infnet.mypet.model.domain;

public class Tosa extends Servico {

	private String porteAnimal;
	private int tipoTosa;
	private Double preco;
	
	public String getPorteAnimal() {
		return porteAnimal;
	}
	public void setPorteAnimal(String porteAnimal) {
		this.porteAnimal = porteAnimal;
	}
	public int getTipoTosa() {
		return tipoTosa;
	}
	public void setTipoTosa(int tipoTosa) {
		this.tipoTosa = tipoTosa;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return porteAnimal + ";" + tipoTosa + ";" +  preco;
	}
}
