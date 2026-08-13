package br.furb.restapifurb.repository;

import br.furb.restapifurb.model.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {}
