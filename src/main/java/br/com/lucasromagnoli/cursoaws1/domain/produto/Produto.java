package br.com.lucasromagnoli.cursoaws1.domain.produto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.math.BigDecimal;

/**
 * @author github.com/lucasromagnoli
 * @since 07/2021
 */
@Table(
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"codigo"})
        }
)
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 32, nullable = false)
    private String nome;
    @Column(length = 24, nullable = false)
    private String modelo;
    @Column(length = 8, nullable = false)
    private String codigo;
    private BigDecimal preco;

    public void salvar(SalvarProdutoUseCase salvarProdutoUseCase) {
        salvarProdutoUseCase.executar(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
