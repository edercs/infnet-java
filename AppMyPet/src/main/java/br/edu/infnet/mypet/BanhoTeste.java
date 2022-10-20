package br.edu.infnet.mypet;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.mypet.model.domain.Banho;

@Component
public class BanhoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println();
		System.out.println("******************** Serviço Consulta ********************");
		
		Banho b1 = new Banho();
		b1.setComShampoo(true);
		b1.setPorteAnimal("Pequeno");
		b1.setPreco(35.0);
		System.out.println("Banho - "  + b1);
		
		Banho b2 = new Banho();
		b2.setComShampoo(true);
		b2.setPorteAnimal("Médio");
		b2.setPreco(40.0);
		System.out.println("Banho - "  + b2);
		
		Banho b3 = new Banho();
		b3.setComShampoo(true);
		b3.setPorteAnimal("Grande");
		b3.setPreco(60.0);
		System.out.println("Banho - "  + b3);
	}

}
