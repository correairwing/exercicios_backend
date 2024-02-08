package br.com.icorrea;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.icorrea.dao.IMarcaDAO;
import br.com.icorrea.dao.MarcaDAO;
import br.com.icorrea.domain.Marca;

public class MarcaTest {

	private IMarcaDAO marcaDAO;
	
	public MarcaTest() {
		marcaDAO = new MarcaDAO();
	}
	
	@Test
	public void cadastrarTest() {
		Marca marca = new Marca();
		marca.setNome("Audi");
		marca = marcaDAO.cadastrar(marca);
		
		assertNotNull(marca);
		assertNotNull(marca.getId());	
	}
}
