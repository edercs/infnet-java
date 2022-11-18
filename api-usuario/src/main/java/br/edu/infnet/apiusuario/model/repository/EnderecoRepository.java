package br.edu.infnet.apiusuario.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.apiusuario.model.domain.Endereco;

public interface EnderecoRepository extends CrudRepository<Endereco, Integer> {

}
