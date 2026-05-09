package Cadastro_Clientes.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Pdv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;

    @ManyToOne
    @JoinColumn(name = "loja_id")
    private Loja loja;

    private String status;


}
