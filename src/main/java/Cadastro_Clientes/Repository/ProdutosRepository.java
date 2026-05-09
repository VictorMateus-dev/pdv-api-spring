package Cadastro_Clientes.Repository;

import Cadastro_Clientes.Model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

    List<Produtos> findAllByOrderByPrecoDesc();
    List<Produtos> findAllByOrderByPrecoAsc();
}
