package br.com.icorrea.service;

import java.util.List;

import br.com.icorrea.domain.Cliente;
import br.com.icorrea.exceptions.DAOException;
import br.com.icorrea.service.controller.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

    Cliente buscarPorCPF(Long cpf) throws DAOException;

    List<Cliente> filtrarClientes(String query);
}
