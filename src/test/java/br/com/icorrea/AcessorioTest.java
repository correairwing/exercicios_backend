package br.com.icorrea;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.icorrea.dao.AcessorioDAO;
import br.com.icorrea.dao.CarroDAO;
import br.com.icorrea.dao.IAcessorioDAO;
import br.com.icorrea.dao.ICarroDAO;
import br.com.icorrea.dao.IMarcaDAO;
import br.com.icorrea.dao.MarcaDAO;
import br.com.icorrea.domain.Acessorio;
import br.com.icorrea.domain.Carro;
import br.com.icorrea.domain.Marca;

public class AcessorioTest {

	private IAcessorioDAO acessorioDAO;
	private ICarroDAO carroDAO;
	private IMarcaDAO marcaDAO;
	
	public AcessorioTest() {
		acessorioDAO = new AcessorioDAO();
		carroDAO = new CarroDAO();
		marcaDAO = new MarcaDAO();
	}
	
	@Test
	public void cadastrar() {
		Carro car = inserirCarro("A5");
		
		Acessorio acessorio = new Acessorio();
		acessorio.setCodigo(111L);
		acessorio.setNome("Aro esportivo R17");
		acessorio.setPreco(3000d);
		acessorio.setCar(car);
		acessorio = acessorioDAO.cadastrar(acessorio);
		
		assertNotNull(acessorio);
		assertNotNull(acessorio.getId());
	}
	
	private Carro inserirCarro(String nome) {
		Marca marca = inserirMarca("Audi");
		
		Carro car = new Carro();
		car.setNome(nome);
		car.setCor("preto");
		car.setMarca(marca);
		return carroDAO.cadastrar(car);
	}
	
	private Marca inserirMarca(String nome) {
		Marca marca = new Marca();
		marca.setNome(nome);
		return marcaDAO.cadastrar(marca);
	}
}
