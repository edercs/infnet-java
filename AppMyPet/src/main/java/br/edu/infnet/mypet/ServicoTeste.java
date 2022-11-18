package br.edu.infnet.mypet;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.mypet.model.domain.Consulta;
import br.edu.infnet.mypet.model.domain.Medicamento;
import br.edu.infnet.mypet.model.domain.Usuario;
import br.edu.infnet.mypet.model.domain.Vacina;
import br.edu.infnet.mypet.model.service.ServicoService;

@Order(3)
@Component
public class ServicoTeste implements ApplicationRunner {

	@Autowired
	private ServicoService servicoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Serviço ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Consulta consulta = new Consulta();
		
		consulta.setId(1);
		consulta.setDescricao("Consulta Cachorro");
		consulta.setPorteAnimal("Grande");
		consulta.setPreco(50.0);
		
		consulta.setDataDaConsulta(LocalDateTime.now());
		consulta.setLocal("Avenida 1");
		consulta.setVeterinario("Teste nome veterinário");
		consulta.setUsuario(usuario);
		servicoService.incluir(consulta);
		
		Medicamento medicamento = new Medicamento();
		medicamento.setId(2);
		medicamento.setDescricao("Medicamento Gato");
		medicamento.setPorteAnimal("Pequeno");
		medicamento.setPreco(50.0);
		
		medicamento.setDosagem("10mg");
		medicamento.setModoDeUso("Oral");
		medicamento.setNome("Nome medicamento teste");
		medicamento.setUsuario(usuario);
		servicoService.incluir(medicamento);
		
		Vacina vacina = new Vacina();
		vacina.setId(3);
		vacina.setDescricao("Vacina Hamster");
		vacina.setPorteAnimal("Pequeno");
		vacina.setPreco(50.0);
		
		vacina.setTipo("Injetável");
		vacina.setTipoAnimal("Tipo animal teste");
		vacina.setIdadeIndicada("3");
		vacina.setUsuario(usuario);
		servicoService.incluir(vacina);
		
	}

}
