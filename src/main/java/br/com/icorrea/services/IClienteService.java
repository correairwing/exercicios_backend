/**
 * 
 */
package br.com.icorrea.services;

import br.com.icorrea.domain.Cliente;
import br.com.icorrea.exceptions.DAOException;
import br.com.icorrea.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
