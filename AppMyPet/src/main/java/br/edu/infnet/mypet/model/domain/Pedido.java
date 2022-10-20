package br.edu.infnet.mypet.model.domain;

import java.util.List;

public class Pedido {

	private Cliente cliente;
	private List<Servico> servicos;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Servico> getServicos() {
		return servicos;
	}
	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
	public void addServico(Servico servico) {
		this.servicos.add(servico);
	}
}
