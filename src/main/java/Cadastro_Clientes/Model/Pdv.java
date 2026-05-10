package Cadastro_Clientes.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Pdv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;

    private String status;

    @OneToMany(mappedBy = "pdv")
    private List<Venda> vendas = new ArrayList<>();
}
