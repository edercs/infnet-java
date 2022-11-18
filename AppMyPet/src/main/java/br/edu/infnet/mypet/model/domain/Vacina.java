package br.edu.infnet.mypet.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tvacina")
public class Vacina extends Servico {
	
	private String tipo;
	private String idadeIndicada;
	private String tipoAnimal;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		return super.toString() + ";" + tipo + ";" + idadeIndicada + ";" + tipoAnimal;
	}
}
