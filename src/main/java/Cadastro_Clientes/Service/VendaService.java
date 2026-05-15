package Cadastro_Clientes.Service;

import Cadastro_Clientes.Model.Venda;
import Cadastro_Clientes.Repository.VendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VendaService {

    private final VendaRepository vendaRepository;

    public List<Venda> listar(){
        return vendaRepository.findAll();
    }

    public Optional<Venda> buscarById(Long id){
        return vendaRepository.findById(id);
    }

    public void cancelarVenda(Long id) {
        if (vendaRepository.existsById(id)) {
            vendaRepository.deleteById(id);
        }
    }

    public Venda criarVenda(Venda venda){
        return vendaRepository.save(venda);
    }

}
