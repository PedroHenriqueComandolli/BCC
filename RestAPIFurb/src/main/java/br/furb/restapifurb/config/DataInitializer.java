package br.furb.restapifurb.config;

import br.furb.restapifurb.model.*;
import br.furb.restapifurb.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.*;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initData(TipoRepository tipoRepository,
                               EquipamentoRepository equipamentoRepository,
                               UsuarioRepository usuarioRepository,
                               PasswordEncoder passwordEncoder) {
        return args -> {
            if (tipoRepository.count() == 0) {
                Tipo computador = tipoRepository.save(new Tipo("Computador"));
                Tipo audiovisual = tipoRepository.save(new Tipo("audiovisual"));
                Tipo impressora = tipoRepository.save(new Tipo("Impressora"));

                equipamentoRepository.save(new Equipamento("Notebook Dell", computador));
                equipamentoRepository.save(new Equipamento("Projetor Epson", audiovisual));
                equipamentoRepository.save(new Equipamento("Notebook Lenovo", computador));
            }

            if (usuarioRepository.findByUsername("admin").isEmpty()) {
                usuarioRepository.save(
                        new Usuario("admin", passwordEncoder.encode("123456"))
                );
            }
        };
    }
}
