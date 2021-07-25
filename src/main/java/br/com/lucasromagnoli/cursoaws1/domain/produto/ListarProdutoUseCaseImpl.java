package br.com.lucasromagnoli.cursoaws1.domain.produto;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author github.com/lucasromagnoli
 * @since 07/2021
 */
@Service
public class ListarProdutoUseCaseImpl implements ListarProdutoUseCase{
    private final ProdutoRepository produtoRepository;

    public ListarProdutoUseCaseImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> executar() {
        return produtoRepository.findAll();
    }
}
