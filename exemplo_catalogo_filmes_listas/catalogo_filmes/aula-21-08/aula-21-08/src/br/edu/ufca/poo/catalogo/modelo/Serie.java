package br.edu.ufca.poo.catalogo.modelo;

import br.edu.ufca.poo.catalogo.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel{
    private int temporada;
    private boolean ativa;
    private int episodioPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento, int duracaoEmMinutos, boolean incluidoNoPlano, int temp, boolean ativa, int epi, int min) {
        super(nome, anoDeLancamento, duracaoEmMinutos, incluidoNoPlano);
        this.temporada = temp;
        this.ativa = ativa;
        this.episodioPorTemporada = epi;
        this.minutosPorEpisodio = min;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporada * 
        episodioPorTemporada * 
        minutosPorEpisodio;
    }

    @Override
    public int getClassificacao() {
        return 0; 
    }

    @Override
    public void avalia_novo(double nota) {
        
    }
    
}
