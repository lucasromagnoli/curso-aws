package br.com.lucasromagnoli.cursoaws1.domain.produto;

import org.springframework.stereotype.Service;

/**
 * @author github.com/lucasromagnoli
 * @since 07/2021
 */
@Service
public class SalvarProdutoUseCaseImpl implements SalvarProdutoUseCase {
    private final ProdutoRepository produtoRepository;

    public SalvarProdutoUseCaseImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public void executar(Produto produto) {
        produtoRepository.save(produto);
    }
}
