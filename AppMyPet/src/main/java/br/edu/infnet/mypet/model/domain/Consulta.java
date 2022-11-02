package br.edu.infnet.mypet.model.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tconsulta")
public class Consulta extends Servico {

	private String raca;
	private String local;
	private LocalDate dataDaConsulta;
	
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public LocalDate getDataDaConsulta() {
		return dataDaConsulta;
	}
	public void setDataDaConsulta(LocalDate dataDaConsulta) {
		this.dataDaConsulta = dataDaConsulta;
	}
	@Override
	public String toString() {
		return super.toString() + ";" + raca + ";" + local + ";" + dataDaConsulta;
	}
}
