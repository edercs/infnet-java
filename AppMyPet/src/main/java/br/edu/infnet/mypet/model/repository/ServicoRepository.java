package br.edu.infnet.mypet.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.mypet.model.domain.Servico;

@Repository
public interface ServicoRepository extends CrudRepository<Servico, Integer> {

}
