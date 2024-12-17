package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacaoImdb,
                         @JsonAlias("imdbVotes") String totalDeAvaliacoesImdb,
                         @JsonAlias("Year") String anoDeLancamento,
                         @JsonAlias("Genre") String genero) {

}
