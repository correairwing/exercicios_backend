package br.com.icorrea;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.icorrea.dao.CursoDAO;
import br.com.icorrea.dao.ICursoDAO;
import br.com.icorrea.domain.Curso;

public class CursoTest {

	private ICursoDAO cursoDAO;

	public CursoTest() {
		cursoDAO = new CursoDAO();
	}
	
	@Test
	public void cadastrar() {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("CURSO TESTE");
		curso.setNome("Curso de Java backend");
		curso = cursoDAO.cadastrar(curso);
		
		assertNotNull(curso);
		assertNotNull(curso.getId());
	}
}
