package br.com.bossini.fatec_ipi_paoo_ws_rest_json.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bossini.fatec_ipi_paoo_ws_rest_json.model.beans.Livro;

public interface LivroRepository extends JpaRepository <Livro, Long> {

}
