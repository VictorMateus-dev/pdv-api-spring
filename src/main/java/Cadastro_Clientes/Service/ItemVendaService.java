package Cadastro_Clientes.Service;

import Cadastro_Clientes.Model.ItemVenda;
import Cadastro_Clientes.Model.Produtos;
import Cadastro_Clientes.Model.Venda;
import Cadastro_Clientes.Repository.ItemVendaRepository;
import Cadastro_Clientes.Repository.ProdutosRepository;
import Cadastro_Clientes.Repository.VendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemVendaService {

    private final ItemVendaRepository itemVendaRepository;
    private final ProdutosRepository produtosRepository;
    private final VendaRepository vendaRepository;

    public List<ItemVenda> listar(){
        return itemVendaRepository.findAll();
    }
    public Optional<ItemVenda> buscarById(Long id){
        return itemVendaRepository.findById(id);
    }

    public ItemVenda adicionarItem(Long vendaId,Long produtoId, int quantidade){
        Venda venda = vendaRepository.findById(vendaId).orElseThrow();
        Produtos produto = produtosRepository.findById(produtoId).orElseThrow();

        ItemVenda item = new ItemVenda();
        item.setVenda(venda);
        item.setProdutos(produto);
        item.setQuantidade(quantidade);

        return itemVendaRepository.save(item);
    }
    public void removerItem(Long id){
        if(itemVendaRepository.existsById(id)){
            itemVendaRepository.deleteById(id);
        }
    }
    public List<ItemVenda> listarItensPorVenda(Long vendaId){
        Venda venda = vendaRepository.findById(vendaId).orElseThrow();
        return venda.getListVenda();
    }
}
