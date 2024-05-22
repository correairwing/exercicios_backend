/**
 * 
 */
package br.com.icorrea.dao.jpa;

import br.com.icorrea.dao.generic.jpa.GenericJpaDAO;
import br.com.icorrea.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
