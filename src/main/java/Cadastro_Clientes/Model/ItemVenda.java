package Cadastro_Clientes.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ItemVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
