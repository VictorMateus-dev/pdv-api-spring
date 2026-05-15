package Cadastro_Clientes.Controller;


import Cadastro_Clientes.Model.Pdv;
import Cadastro_Clientes.Service.PdvService;
import Cadastro_Clientes.Service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pdv")
@RequiredArgsConstructor
public class PdvController {

    public final PdvService pdvService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pdv salvarPdv(@RequestBody Pdv pdv){
        return pdvService.salvar(pdv);
    }

    @GetMapping
    public List<Pdv> listar(){
        return pdvService.listar();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Pdv> buscarById(@PathVariable Long id){
        return pdvService.listarById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
