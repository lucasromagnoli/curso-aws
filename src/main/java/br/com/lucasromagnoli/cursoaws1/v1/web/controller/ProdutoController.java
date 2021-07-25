package br.com.lucasromagnoli.cursoaws1.v1.web.controller;

import br.com.lucasromagnoli.cursoaws1.domain.produto.ListarProdutoUseCase;
import br.com.lucasromagnoli.cursoaws1.domain.produto.Produto;
import br.com.lucasromagnoli.cursoaws1.domain.produto.SalvarProdutoUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author github.com/lucasromagnoli
 * @since 07/2021
 */
@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private final SalvarProdutoUseCase salvarProdutoUseCase;
    private final ListarProdutoUseCase listarProdutoUseCase;

    public ProdutoController(SalvarProdutoUseCase salvarProdutoUseCase, ListarProdutoUseCase listarProdutoUseCase) {
        this.salvarProdutoUseCase = salvarProdutoUseCase;
        this.listarProdutoUseCase = listarProdutoUseCase;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listar() {
        return ResponseEntity.ok(listarProdutoUseCase.executar());
    }

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto) {
        produto.salvar(salvarProdutoUseCase);
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);
    }
}
