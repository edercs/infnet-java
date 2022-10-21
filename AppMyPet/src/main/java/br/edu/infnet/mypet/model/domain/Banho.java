package br.edu.infnet.mypet.model.domain;

public class Banho extends Servico {

	private boolean comShampoo;
	
	public boolean isComShampoo() {
		return comShampoo;
	}
	public void setComShampoo(boolean comShampoo) {
		this.comShampoo = comShampoo;
	}
	
	@Override
	public String toString() {
		return super.toString() + ";" + comShampoo;
	}
	 
	
}
