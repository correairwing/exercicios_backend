package br.com.icorrea.service;

import java.util.List;

import br.com.icorrea.dao.IProdutoDAO;
import br.com.icorrea.domain.Produto;
import br.com.icorrea.service.controller.GenericService;

import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    private IProdutoDAO produtoDao;

    @Inject
    public ProdutoService(IProdutoDAO produtoDao) {
        super(produtoDao);
        this.produtoDao = produtoDao;
    }

    @Override
    public List<Produto> filtrarProdutos(String query) {
        return produtoDao.filtrarProdutos(query);
    }
}
