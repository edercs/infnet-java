package br.edu.infnet.mypet;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.mypet.model.domain.Medicamento;

@Component
public class MedicamentoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println();
		System.out.println("******************** Serviço Medicamento ********************");
		
		Medicamento m1 = new Medicamento();
		m1.setNome("Fortekor");
		m1.setDosagem("5mg");
		m1.setModoDeUso("Oral");
		m1.setPorteAnimal("Pequeno");
		m1.setPreco(35.0);
		System.out.println("Medicamento - "  + m1);
		
		Medicamento m2 = new Medicamento();
		m2.setNome("Gaviz V Omeprazol");
		m2.setDosagem("10mg");
		m2.setModoDeUso("Oral");
		m2.setPorteAnimal("Médio");
		m2.setPreco(40.0);
		System.out.println("Medicamento - "  + m2);
		
		Medicamento m3 = new Medicamento();
		m2.setNome("Apoquel Zoetis");
		m2.setDosagem("5,4mg");
		m2.setModoDeUso("Oral");
		m2.setPorteAnimal("Grande");
		m2.setPreco(60.0);
		System.out.println("Medicamento - "  + m3);
	}

}
