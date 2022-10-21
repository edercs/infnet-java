package br.edu.infnet.mypet;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.mypet.model.domain.Vacina;

@Component
public class VacinaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println();
		System.out.println("******************** Serviço Vacina ********************");
		
		Vacina v1 = new Vacina();
		v1.setDescricao("óctupla v8");
		v1.setIdadeIndicada("Filhote");
		v1.setTipoAnimal("Cães");
		v1.setPreco(30.0);
		System.out.println("Vacina - " + v1);
		
		Vacina v2 = new Vacina();
		v2.setDescricao("Enterite Viral");
		v2.setIdadeIndicada("Todas");
		v2.setTipoAnimal("Patos");
		v2.setPreco(30.0);
		System.out.println("Vacina - " + v2);
		
		Vacina v3 = new Vacina();
		v3.setDescricao("Tétano");
		v3.setIdadeIndicada("Todas");
		v3.setTipoAnimal("Cavalo");
		v3.setPreco(30.0);
		System.out.println("Vacina - " + v3);
	}

}
