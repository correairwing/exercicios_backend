/**
 * 
 */
package com.icorrea.exercicio.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.icorrea.exercicio.domain.Produto;
import com.icorrea.exercicio.domain.Produto.Status;



/**
 * @author irwing.correa
 *
 */
@Repository
public interface IProdutoRepository extends MongoRepository<Produto, String>{

	Optional<Produto> findByCodigo(String codigo);
	
	Page<Produto> findAllByStatus(Pageable pageable, Status status);
}
