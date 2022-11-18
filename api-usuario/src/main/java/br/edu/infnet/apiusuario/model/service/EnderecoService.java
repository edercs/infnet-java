package br.edu.infnet.apiusuario.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiusuario.model.domain.Endereco;
import br.edu.infnet.apiusuario.model.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public void incluir(Endereco endereco) {
		enderecoRepository.save(endereco);
	}

	public void excluir(Integer id) {
		enderecoRepository.deleteById(id);
	}

}
