/**
 * 
 */
package br.com.icorrea.services;

import br.com.icorrea.domain.Cliente;
import br.com.icorrea.exceptions.TipoChaveNaoEncontradaException;


public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
