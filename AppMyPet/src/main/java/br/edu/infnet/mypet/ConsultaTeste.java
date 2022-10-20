package br.edu.infnet.mypet;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.mypet.model.domain.Consulta;

@Component
public class ConsultaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println();
		System.out.println("******************** Serviço Consulta ********************");
		
		Consulta c1 = new Consulta();
		c1.setPorteAnimal("Pequeno");
		c1.setRaca("Shih-tzu");
		c1.setPreco(60.0);
		System.out.println("Consulta - " + c1);
		
		Consulta c2 = new Consulta();
		c2.setPorteAnimal("Médio");
		c2.setRaca("Shih-tzu");
		c2.setPreco(80.0);
		System.out.println("Consulta - " + c2);
		
		Consulta c3 = new Consulta();
		c3.setPorteAnimal("Grande");
		c3.setRaca("Shih-tzu");
		c3.setPreco(100.0);
		System.out.println("Consulta - " + c3);
	}
}