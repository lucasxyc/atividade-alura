package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public record DadosEpisodio (@JsonAlias("Title") String titulo,
                            @JsonAlias("Runtime") String duracaoEmMinutos,
                            @JsonAlias("imdbRating") String avaliacaoImdb,
                            @JsonAlias("Episode") Integer episodio,
                            @JsonAlias("Released") String dataDeExibicao) {

}
