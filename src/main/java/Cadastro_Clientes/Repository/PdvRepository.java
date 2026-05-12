package Cadastro_Clientes.Repository;

import Cadastro_Clientes.Model.Pdv;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PdvRepository extends JpaRepository<Pdv, Long> {
}
