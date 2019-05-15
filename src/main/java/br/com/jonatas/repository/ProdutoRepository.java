package br.com.jonatas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jonatas.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
