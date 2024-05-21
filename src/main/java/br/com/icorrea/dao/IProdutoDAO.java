package br.com.icorrea.dao;

import java.util.List;

import br.com.icorrea.dao.generic.IGenericDAO;
import br.com.icorrea.domain.Produto;


public interface IProdutoDAO extends IGenericDAO<Produto, String> {

    List<Produto> filtrarProdutos(String query);

}
