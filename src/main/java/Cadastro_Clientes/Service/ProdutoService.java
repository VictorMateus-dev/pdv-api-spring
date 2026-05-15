package Cadastro_Clientes.Service;


import Cadastro_Clientes.DTO.ProdutoRequestDTO;
import Cadastro_Clientes.Model.Produtos;
import Cadastro_Clientes.Repository.ProdutosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PatchMapping;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProdutoService {
    public final ProdutosRepository produtosRepository;

    public void save(ProdutoRequestDTO produtoRequestDTO){
       Produtos produto = Produtos.builder()
               .codigo_Barras(produtoRequestDTO.codigo_Barras())
               .nome(produtoRequestDTO.nome())
               .descricao(produtoRequestDTO.descricao())
               .preco(produtoRequestDTO.preco())
               .estoque(produtoRequestDTO.estoque())
                       .build();

        produtosRepository.save(produto);
    }

    public final List<Produtos> listar(){
        return produtosRepository.findAll();
    }

    public final Optional<Produtos> buscarPorId(Long codigo_Barras){
        return produtosRepository.findById(codigo_Barras);
    }

    public void deletarProduto(Long codigo_Barras){
        produtosRepository.deleteById(codigo_Barras);
    }

    public final List<Produtos> listarMaiorPreco(){
        return produtosRepository.findAllByOrderByPrecoDesc();
    }

    public final List<Produtos> listarMenorPreco(){
        return produtosRepository.findAllByOrderByPrecoAsc();
    }
}
