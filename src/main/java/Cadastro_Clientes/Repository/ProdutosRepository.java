package Cadastro_Clientes.Repository;

import Cadastro_Clientes.Model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

    List<Produtos> findAllByOrderByPrecoDesc();
    List<Produtos> findAllByOrderByPrecoAsc();

    Optional<Produtos> findByCodigoBarras(String codigoBarras);

    boolean existsByCodigoBarras(String codigoBarras);
}
