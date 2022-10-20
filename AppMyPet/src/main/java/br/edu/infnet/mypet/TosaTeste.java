package br.edu.infnet.mypet;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.mypet.model.domain.Tosa;

@Component
public class TosaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println();
		System.out.println("******************** Serviço Tosa ********************");
		
		Tosa t1 = new Tosa();
		t1.setPorteAnimal("Pequeno");
		t1.setTipoTosa(1);
		t1.setPreco(30.0);
		System.out.println("Tosa - " + t1);
		
		Tosa t2 = new Tosa();
		t2.setPorteAnimal("Médio");
		t2.setTipoTosa(2);
		t2.setPreco(30.0);
		System.out.println("Tosa - " + t2);
		
		Tosa t3 = new Tosa();
		t3.setPorteAnimal("Grande");
		t3.setTipoTosa(1);
		t3.setPreco(30.0);
		System.out.println("Tosa - " + t3);
	}

}
