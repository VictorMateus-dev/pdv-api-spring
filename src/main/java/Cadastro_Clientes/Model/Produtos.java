package Cadastro_Clientes.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Produtos {


    @Id
    private Long codigo_Barras;

    @Column(nullable = false)
    private String nome;

    private String descricao;

    @Column(nullable = false)
    private double preco;

    @ManyToMany(mappedBy = "produtos")
    private List<Venda> vendas = new ArrayList<>();
}
