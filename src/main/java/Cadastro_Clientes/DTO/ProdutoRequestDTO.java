package Cadastro_Clientes.DTO;
import java.math.BigDecimal;


public record ProdutoRequestDTO(

        Long codigo_Barras,

        String nome,

        String descricao,

        BigDecimal preco,

        int estoque

) {
}

