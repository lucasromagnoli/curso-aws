package br.com.lucasromagnoli.cursoaws1.domain.produto;

import java.util.List;

/**
 * @author github.com/lucasromagnoli
 * @since 07/2021
 */
public interface ListarProdutoUseCase {
    List<Produto> executar();
}
