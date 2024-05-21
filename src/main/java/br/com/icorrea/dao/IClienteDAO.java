package br.com.icorrea.dao;

import java.util.List;

import br.com.icorrea.dao.generic.IGenericDAO;
import br.com.icorrea.domain.Cliente;


public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

    List<Cliente> filtrarClientes(String query);
}
