package br.edu.infnet.mypet.model.domain;

public class Banho extends Servico {

	private String porteAnimal;
	private boolean comShampoo;
	private Double preco;
	
	
	public String getPorteAnimal() {
		return porteAnimal;
	}
	public void setPorteAnimal(String porteAnimal) {
		this.porteAnimal = porteAnimal;
	}
	public boolean isComShampoo() {
		return comShampoo;
	}
	public void setComShampoo(boolean comShampoo) {
		this.comShampoo = comShampoo;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return porteAnimal + ";" + comShampoo + ";" +  preco;
	}
	 
	
}