package br.com.jonatas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.jonatas.model.ProdutoModel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@Table(name="produto")
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @NotNull
    @Column(name="nome", length = 128)
    private String nome;
    
    @Column(name="preco", length = 128)
    private Double preco;
    
    @Column(name="qtd", length = 128)
    private Integer qtd;
    
    public Produto(ProdutoModel model) {
        this();
        this.nome = model.getNome();
        this.preco = model.getPreco();
        this.qtd = model.getQtd();
    }

    public void addEstoque(Integer qtd) {
        this.qtd += qtd;
    }
    
    public void removerEstoque(Integer qtd) {
        
        if (this.qtd >= qtd) {
            this.qtd -= qtd;
        } else {
            throw new RuntimeException("Erro ao remover qtd do estoque");
        }
    }

    public void alterar(ProdutoModel model) {
        
        this.nome = model.getNome();
        this.preco = model.getPreco();
        this.qtd = model.getQtd();
    }
}    
