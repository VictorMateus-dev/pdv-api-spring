package Cadastro_Clientes.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Produtos {


    @Id
    private Long codigo_Barras;

    private String nome;

    private String descricao;

    private double preco;
}
