/**
 * 
 */
package br.com.icorrea.services;

import br.com.icorrea.dao.IProdutoDAO;
import br.com.icorrea.domain.Produto;
import br.com.icorrea.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
