package br.edu.infnet.mypet.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.mypet.model.domain.Cliente;


@FeignClient(url = "localhost:8082/api/cliente", name = "clienteClient")
public interface IClienteClient {

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Cliente cliente);
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);
	
	@GetMapping(value = "/listar")
	public List<Cliente> obterLista();
	
	@GetMapping(value = "/usuario/{idUsuario}/listar")
	public List<Cliente> obterLista(@PathVariable Integer idUsuario);
	
}
