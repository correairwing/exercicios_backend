package br.com.icorrea.service;

import java.util.List;

import br.com.icorrea.domain.Produto;
import br.com.icorrea.service.controller.IGenericService;


public interface IProdutoService extends IGenericService<Produto, String> {

    List<Produto> filtrarProdutos(String query);
}
