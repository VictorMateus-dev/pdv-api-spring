package Cadastro_Clientes.Service;

import Cadastro_Clientes.Model.Pdv;
import Cadastro_Clientes.Repository.PdvRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PdvService {

    public final PdvRepository pdvRepository;

    public Pdv salvar(Pdv pdv){
        return pdvRepository.save(pdv);
    }

    public List<Pdv> listar(){
        return pdvRepository.findAll();
    }

    public Optional<Pdv> listarById(Long id){
        return pdvRepository.findById(id);
    }


}
