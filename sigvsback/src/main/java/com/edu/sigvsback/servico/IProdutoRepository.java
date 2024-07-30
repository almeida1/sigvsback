package com.edu.sigvsback.servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.edu.sigvsback.model.Produto;

@Repository
public interface IProdutoRepository extends JpaRepository<Produto, Long> {
    // Método personalizado para calcular o valor total financeiro imobilizado no
    // estoque
    @Query("SELECT SUM(p.custo * p.quantidadeNoEstoque) FROM Produto p")
    Double calcularTotalCustoQuantidade();
}