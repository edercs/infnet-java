package br.edu.infnet.mypet.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Transient;

public class Pedido {

	private Integer id;
	private String descricao;
	private LocalDateTime data;
	
	@Transient
	private Cliente cliente;
	
	@Transient
	private List<Servico> servicos;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
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
