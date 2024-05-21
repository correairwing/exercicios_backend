package br.com.icorrea.dao;

import javax.persistence.TypedQuery;

import br.com.icorrea.dao.generic.GenericDAO;
import br.com.icorrea.domain.Cliente;

import java.util.List;


public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

    public ClienteDAO() {
        super(Cliente.class);
    }

    @Override
    public List<Cliente> filtrarClientes(String query) {
        TypedQuery<Cliente> tpQuery =
                this.entityManager.createNamedQuery("Cliente.findByNome", this.persistenteClass);
        tpQuery.setParameter("nome", "%" + query + "%");
        return tpQuery.getResultList();
    }
}
