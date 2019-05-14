package br.com.jonatas.service;

import java.util.List;

import br.com.jonatas.model.ProdutoModel;

public interface ConsoleService {

    public ProdutoModel cadastrar(ProdutoModel model);

    public ProdutoModel alterar(ProdutoModel model);

    public List<ProdutoModel> mostrarTudo();

    public ProdutoModel remover(Long id);

}
