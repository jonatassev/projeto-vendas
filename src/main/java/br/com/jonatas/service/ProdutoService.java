package br.com.jonatas.service;


import java.util.List;

import br.com.jonatas.domain.Produto;

public interface ProdutoService {
	

    Produto cadastrar(Produto model);

    List<Produto> mostrarTudo();
    
    Produto consultar(Long id);



}
