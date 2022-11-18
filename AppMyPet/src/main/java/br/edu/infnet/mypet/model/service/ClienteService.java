package br.edu.infnet.mypet.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.mypet.clients.IClienteClient;
import br.edu.infnet.mypet.model.domain.Cliente;

@Service
public class ClienteService {
	
	@Autowired
	private IClienteClient clienteClient; 

	public void incluir(Cliente cliente) {
		clienteClient.incluir(cliente);
	}
	
	public void excluir(Integer id) {
		clienteClient.excluir(id);
	}
	
	public Collection<Cliente> obterLista(){
		return (Collection<Cliente>) clienteClient.obterLista();
	}
	
	public Collection<Cliente> obterLista(Integer idUsuario){
		return (Collection<Cliente>) clienteClient.obterLista(idUsuario);
	}
}
