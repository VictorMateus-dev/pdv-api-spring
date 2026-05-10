package Cadastro_Clientes.Repository;

import Cadastro_Clientes.Model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, Long> {
}
