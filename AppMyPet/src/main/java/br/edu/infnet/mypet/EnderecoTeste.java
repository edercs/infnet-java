package br.edu.infnet.mypet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.mypet.model.domain.Endereco;
import br.edu.infnet.mypet.model.service.UsuarioService;

@Order(8)
@Component
public class EnderecoTeste implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("####### Consulta Endereço por CEP #######");
		
		Endereco endereco = usuarioService.obterCep("75063560");
		
		System.out.println(endereco);
		
		System.out.println("***** Muito legal essa API para consulta de endereço *****");
	}

}
