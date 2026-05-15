package Cadastro_Clientes.Controller;

import Cadastro_Clientes.Model.Venda;
import Cadastro_Clientes.Service.VendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/venda")
@RequiredArgsConstructor
public class VendaController {

    private final VendaService vendaService;

    @GetMapping("/listar")
    public List<Venda> listar(){
        return vendaService.listar();
    }

    @GetMapping("/{id}")
    public Optional<Venda> buscarById(@PathVariable Long id){
        return vendaService.buscarById(id);
    }

    @GetMapping("/{id}")
    public void deletar(@PathVariable Long id){
        vendaService.cancelarVenda(id);
    }


}
