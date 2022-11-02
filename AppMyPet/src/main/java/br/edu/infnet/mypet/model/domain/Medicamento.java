package br.edu.infnet.mypet.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tmedicamento")
public class Medicamento extends Servico {

	private String nome;
	private String dosagem;
	private String modoDeUso;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDosagem() {
		return dosagem;
	}

	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}

	public String getModoDeUso() {
		return modoDeUso;
	}

	public void setModoDeUso(String modoDeUso) {
		this.modoDeUso = modoDeUso;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + nome + ";" + dosagem + ";" + modoDeUso;
	}
	 
	
}
