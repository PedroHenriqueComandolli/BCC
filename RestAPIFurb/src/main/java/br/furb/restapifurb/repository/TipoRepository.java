package br.furb.restapifurb.repository;

import br.furb.restapifurb.model.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoRepository extends JpaRepository<Tipo, Long> {}
