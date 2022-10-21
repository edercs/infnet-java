package br.edu.infnet.mypet.model.domain;

public class Vacina extends Servico {

	private String descricao;
	private String idadeIndicada;
	private String tipoAnimal;
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getIdadeIndicada() {
		return idadeIndicada;
	}
	public void setIdadeIndicada(String idadeIndicada) {
		this.idadeIndicada = idadeIndicada;
	}
	public String getTipoAnimal() {
		return tipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + descricao + ";" + idadeIndicada + ";" + tipoAnimal;
	}
}
