package br.com.jonatas.model;

import java.util.List;

import br.com.jonatas.domain.Produto;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
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

	public ProdutoModel(List<Produto> mostrarTudo) {
	}
}
