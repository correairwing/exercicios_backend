package br.com.icorrea;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.icorrea.dao.IProdutoDAO;
import br.com.icorrea.dao.ProdutoDAO;
import br.com.icorrea.domain.Produto;

public class ProdutoTest {

	
	private IProdutoDAO produtoDAO;
	
	public ProdutoTest() {
		produtoDAO = new ProdutoDAO();
	}

	@Test
	public void cadastrar() {
		Produto prod = new Produto();
		prod.setCodigo(00001L);
		prod.setNome("Pneu 190/60 R15");
		prod.setPreco(350d);
		prod = produtoDAO.cadastrar(prod);
		
		assertNotNull(prod);
		assertNotNull(prod.getId());
	}
}
