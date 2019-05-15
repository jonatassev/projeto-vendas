package br.com.jonatas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jonatas.domain.Produto;
import br.com.jonatas.repository.ProdutoRepository;
import br.com.jonatas.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
	public Produto cadastrar(Produto model) {
		produtoRepository.save(model);
		return model;

	}

	@Override
	public List<Produto> mostrarTudo() {
		return produtoRepository.findAll();
	}
	
	

	@Override
	public Produto consultar(Long idProduto) {
		return produtoRepository.findAll().stream().filter(item -> idProduto.equals(item.getId())).findAny().orElse(null);
	}

}
