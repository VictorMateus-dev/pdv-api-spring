package Cadastro_Clientes.Model;

import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDateTime;

@Entity
@Data
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pdv_id")
    private Pdv pdv;

    private LocalDateTime dataHora_Venda;

    private double valorTotal;

    private double valorDescoto;

    private double valorFinal;

    private String status;


}
