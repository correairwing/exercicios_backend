package br.com.icorrea.service;

import java.util.List;

import br.com.icorrea.dao.IClienteDAO;
import br.com.icorrea.domain.Cliente;
import br.com.icorrea.exceptions.DAOException;
import br.com.icorrea.exceptions.MaisDeUmRegistroException;
import br.com.icorrea.exceptions.TableException;
import br.com.icorrea.service.controller.GenericService;

import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    private IClienteDAO clienteDAO;

    @Inject
    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Cliente> filtrarClientes(String query) {
        return clienteDAO.filtrarClientes(query);
    }
}