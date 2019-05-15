package br.com.jonatas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jonatas.domain.Produto;
import br.com.jonatas.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;
    
    @PostMapping("/cadastrar")
    public Produto cadastrar(@RequestBody Produto model) {
        return new Produto(produtoService.cadastrar(model));
    }
    
    @GetMapping("/mostrar-tudo")
    public Produto mostrarTudo() {
        return new Produto(produtoService.mostrarTudo());
    }
 
}