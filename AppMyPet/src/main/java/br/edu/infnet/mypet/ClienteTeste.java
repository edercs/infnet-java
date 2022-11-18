package br.edu.infnet.mypet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.mypet.model.domain.Cliente;
import br.edu.infnet.mypet.model.domain.Usuario;
import br.edu.infnet.mypet.model.service.ClienteService;

@Order(2)
@Component
public class ClienteTeste implements ApplicationRunner {

	@Autowired
	private ClienteService clienteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("####### Cadastramento de Clientes #######");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setId(1);
		cliente1 .setEmail("cliente@gmail.com");
		cliente1.setTelefone("11 3333-2222");
		cliente1.setNome("Primeiro cliente");
		cliente1.setUsuario(usuario);
		clienteService.incluir(cliente1);
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2);
		cliente2 .setEmail("cliente1@gmail.com");
		cliente2.setTelefone("11 3333-2222");
		cliente2.setNome("Segundo cliente");
		cliente2.setUsuario(usuario);
		clienteService.incluir(cliente1);
		
	}

}
