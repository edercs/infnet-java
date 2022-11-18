package br.edu.infnet.mypet.model.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tconsulta")
public class Consulta extends Servico {

	private String veterinario;
	private String local;
	private LocalDateTime dataDaConsulta;
	
	
	public String getVeterinario() {
		return veterinario;
	}
	public void setVeterinario(String veterinario) {
		this.veterinario = veterinario;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public LocalDateTime getDataDaConsulta() {
		return dataDaConsulta;
	}
	public void setDataDaConsulta(LocalDateTime dataDaConsulta) {
		this.dataDaConsulta = dataDaConsulta;
	}
	@Override
	public String toString() {
		return super.toString() + ";" + veterinario + ";" + local + ";" + dataDaConsulta;
	}
}
