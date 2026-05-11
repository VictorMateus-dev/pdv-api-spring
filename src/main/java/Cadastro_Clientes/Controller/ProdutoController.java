package Cadastro_Clientes.Controller;

import Cadastro_Clientes.DTO.ProdutoRequestDTO;
import Cadastro_Clientes.Model.Produtos;
import Cadastro_Clientes.Service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ProdutoController {

    public final ProdutoService produtoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody ProdutoRequestDTO produtoRequestDTO){
        produtoService.save(produtoRequestDTO);
    }

    @GetMapping
    public List<Produtos> listar(){
        return produtoService.listar();
    }

    @GetMapping("/{codigo_Barras}")
    public ResponseEntity<Produtos> buscarPorCodigo(@PathVariable Long codigo_Barras){
        return produtoService.buscarPorId(codigo_Barras)
                .map(ResponseEntity:: ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{codigo_Barras}")
    public ResponseEntity<Produtos> deletar(@PathVariable Long codigo_Barras){
        produtoService.deletarProduto(codigo_Barras);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/maior-preco")
    public List<Produtos> listarMaiorPreco(){
        return produtoService.listarMaiorPreco();
    }

    @GetMapping("/menor-preco")
    public List<Produtos> listarMenorPreco(){
        return produtoService.listarMenorPreco();
    }


}
