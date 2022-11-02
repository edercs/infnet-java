package br.edu.infnet.mypet.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.mypet.model.domain.Vacina;
import br.edu.infnet.mypet.model.repository.VacinaRepository;

@Service
public class ConsultaService {
	
	@Autowired
	private VacinaRepository vacinaRepository;

	public void incluir(Vacina vacina) {
		vacinaRepository.save(vacina);
	}
	
	public void excluir(Integer id) {
		vacinaRepository.deleteById(id);
	}
	
	public Collection<Vacina> obterLista(){
		return (Collection<Vacina>) vacinaRepository.findAll();
	}
}
