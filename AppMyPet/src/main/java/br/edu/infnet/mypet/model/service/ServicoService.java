package br.edu.infnet.mypet.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.mypet.model.domain.Servico;
import br.edu.infnet.mypet.model.repository.ServicoRepository;

@Service
public class ServicoService {
	
	@Autowired
	private ServicoRepository servicoRepository;

	public void incluir(Servico servico) {
		servicoRepository.save(servico);
	}
	
	public void excluir(Integer id) {
		servicoRepository.deleteById(id);
	}
	
	public Collection<Servico> obterLista(){
		return (Collection<Servico>) servicoRepository.findAll();
	}
}
