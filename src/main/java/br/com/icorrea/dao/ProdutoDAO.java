package br.com.icorrea.dao;

import javax.persistence.TypedQuery;

import br.com.icorrea.dao.generic.GenericDAO;
import br.com.icorrea.domain.Produto;

import java.util.List;


public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {

    public ProdutoDAO() {
        super(Produto.class);
    }

    @Override
    public List<Produto> filtrarProdutos(String query) {
        TypedQuery<Produto> tpQuery =
                this.entityManager.createNamedQuery("Produto.findByNome", this.persistenteClass);
        tpQuery.setParameter("nome", "%" + query + "%");
        return tpQuery.getResultList();
    }
}
