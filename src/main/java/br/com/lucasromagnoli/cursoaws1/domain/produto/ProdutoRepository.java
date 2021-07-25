package br.com.lucasromagnoli.cursoaws1.domain.produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author github.com/lucasromagnoli
 * @since 07/2021
 */
@Repository
interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
