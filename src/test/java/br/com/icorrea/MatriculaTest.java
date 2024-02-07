package br.com.icorrea;

import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import br.com.icorrea.dao.IMatriculaDAO;
import br.com.icorrea.dao.MatriculaDAO;
import br.com.icorrea.domain.Matricula;

public class MatriculaTest {

	private IMatriculaDAO matriculaDAO;
	
	public MatriculaTest() {
		matriculaDAO = new MatriculaDAO();
	}
	
	@Test
	public void cadastrar() {
		Matricula mat = new Matricula();
		mat.setCodigo("A!");
		mat.setDataMatricula(Instant.now());
		mat.setStatus("ATIVA");
		mat.setValor(2000d);
		matriculaDAO.cadastrar(mat);
		
		assertNotNull(mat);
		assertNotNull(mat.getId());
	}
}
