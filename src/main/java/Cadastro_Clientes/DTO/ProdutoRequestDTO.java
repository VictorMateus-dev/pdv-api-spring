package Cadastro_Clientes.DTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;


public record ProdutoRequestDTO(

        @NotNull
        Long codigo_Barras,

        @NotBlank
        String nome,

        String descricao,

        @NotNull
        BigDecimal preco,

        @NotNull
        @Positive
        int estoque

) {
}

