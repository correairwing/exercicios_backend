package br.com.icorrea;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.icorrea.dao.CarroDAO;
import br.com.icorrea.dao.ICarroDAO;
import br.com.icorrea.dao.IMarcaDAO;
import br.com.icorrea.dao.MarcaDAO;
import br.com.icorrea.domain.Carro;
import br.com.icorrea.domain.Marca;

public class CarroTest {

	private ICarroDAO carroDAO;
	private IMarcaDAO marcaDAO;
	
	public CarroTest() {
		carroDAO = new CarroDAO();
		marcaDAO = new MarcaDAO();
	}
	
	@Test
	public void cadastrarTest() {
		Marca marca = inserirMarca("Audi");
		
		Carro car = new Carro();
		car.setNome("A5");
		car.setCor("preto");
		car.setMarca(marca);
		car = carroDAO.cadastrar(car);
		
		assertNotNull(car);
		assertNotNull(car.getId());
	}
	
	private Marca inserirMarca(String nome) {
		Marca marca = new Marca();
		marca.setNome(nome);
		return marcaDAO.cadastrar(marca);
	}
}
