package br.com.jonatas.model;

import br.com.jonatas.domain.Produto;
import lombok.Getter;

@Getter
public class ProdutoModel {
    
    private Long id;
    private String nome;
    private Double preco;
    private Integer qtd;
    
    public ProdutoModel(Produto domain) {
        this.id = domain.getId();
        this.nome = domain.getNome();
        this.preco = domain.getPreco();
        this.qtd = domain.getQtd();
    }
}
