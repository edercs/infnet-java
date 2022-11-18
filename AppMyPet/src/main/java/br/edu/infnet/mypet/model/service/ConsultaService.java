package br.edu.infnet.mypet.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.mypet.model.domain.Consulta;
import br.edu.infnet.mypet.model.repository.ConsultaRepository;

@Service
public class ConsultaService {
	
	@Autowired
	private ConsultaRepository consultaRepository;

	public void incluir(Consulta consulta) {
		consultaRepository.save(consulta);
	}
	
	public void excluir(Integer id) {
		consultaRepository.deleteById(id);
	}
	
	public Collection<Consulta> obterLista(){
		return (Collection<Consulta>) consultaRepository.findAll();
	}
}
