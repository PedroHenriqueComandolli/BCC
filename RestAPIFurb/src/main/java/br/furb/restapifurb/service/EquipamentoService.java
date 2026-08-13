package br.furb.restapifurb.service;

import br.furb.restapifurb.dto.EquipamentoPatchRequest;
import br.furb.restapifurb.dto.EquipamentoRequest;
import br.furb.restapifurb.model.Equipamento;
import br.furb.restapifurb.model.Tipo;
import br.furb.restapifurb.repository.EquipamentoRepository;
import br.furb.restapifurb.repository.TipoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipamentoService {

    private final EquipamentoRepository equipamentoRepository;
    private final TipoRepository tipoRepository;

    public EquipamentoService(EquipamentoRepository equipamentoRepository, TipoRepository tipoRepository) {
        this.equipamentoRepository = equipamentoRepository;
        this.tipoRepository = tipoRepository;
    }

    public List<Equipamento> listar() {
        return equipamentoRepository.findAll();
    }

    public Equipamento buscar(Long id) {
        return equipamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipamento não encontrado"));
    }

    public Equipamento criar(EquipamentoRequest request) {
        Tipo tipo = tipoRepository.findById(request.tipo().id())
                .orElseThrow(() -> new RuntimeException("Tipo não encontrado"));

        return equipamentoRepository.save(new Equipamento(request.nome(), tipo));
    }

    public Equipamento atualizarParcial(Long id, EquipamentoPatchRequest request) {
        Equipamento equipamento = buscar(id);

        if (request.nome() != null) {
            equipamento.setNome(request.nome());
        }

        if (request.tipo() != null) {
            Tipo tipo = tipoRepository.findById(request.tipo().id())
                    .orElseThrow(() -> new RuntimeException("Tipo não encontrado"));
            equipamento.setTipo(tipo);
        }

        return equipamentoRepository.save(equipamento);
    }

    public void remover(Long id) {
        Equipamento equipamento = buscar(id);
        equipamentoRepository.delete(equipamento);
    }
}
