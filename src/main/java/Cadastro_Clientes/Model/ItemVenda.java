package Cadastro_Clientes.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class ItemVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name ="codigo_Barras")
    private Produtos produtos;

    @ManyToOne
    @JoinColumn(name = "venda_id")
    private Venda venda;

    private int quantidade;

}
