package br.edu.ufca.poo.catalogo.calculos;

import br.edu.ufca.poo.catalogo.modelo.Filme;
import br.edu.ufca.poo.catalogo.modelo.Serie;
import br.edu.ufca.poo.catalogo.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
    /* 
    public void inclui(Filme filme){
        this.tempoTotal += filme.getDuracaoEmMinutos();
    }

    public void inclui(Serie serie){
        this.tempoTotal += serie.getDuracaoEmMinutos();
    }
    */

    

}
