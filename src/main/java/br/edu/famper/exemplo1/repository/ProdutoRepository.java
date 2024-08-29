package br.edu.famper.exemplo1.repository;

import br.edu.famper.exemplo1.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {

}
