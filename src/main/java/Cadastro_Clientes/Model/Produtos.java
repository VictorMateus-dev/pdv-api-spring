package Cadastro_Clientes.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
public class Produtos {


    @Id
    private Long codigo_Barras;

    private String nome;

    private String descricao;

    private double preco;
}
