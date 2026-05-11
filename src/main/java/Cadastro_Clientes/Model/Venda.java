package Cadastro_Clientes.Model;

import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataHora_Venda;

    private double valorTotal;

    private double valorDescoto;

    private double valorFinal;

    private String status;

    @ManyToOne
    @JoinColumn(name = "pdv_id")
    private Pdv pdv;

    @ManyToMany
    @JoinTable(
            name = "venda_produto",
            joinColumns = @JoinColumn(name = "venda_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<Produtos> produtos = new ArrayList<>();


}
