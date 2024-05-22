/**
 * 
 */
package br.com.icorrea.dao;

import br.com.icorrea.dao.generic.IGenericDAO;
import br.com.icorrea.domain.Venda;
import br.com.icorrea.exceptions.DAOException;
import br.com.icorrea.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
