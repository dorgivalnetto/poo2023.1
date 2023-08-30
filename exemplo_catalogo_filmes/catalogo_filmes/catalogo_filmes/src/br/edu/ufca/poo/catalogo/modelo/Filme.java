package br.edu.ufca.poo.catalogo.modelo;

import br.edu.ufca.poo.catalogo.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel{
    private String diretor;

    public Filme(){}

    public Filme(String diretor) {
        this.diretor = diretor;
    }

    public Filme(String nome, boolean incluidoNoPlano, int anoDeLancamento, int duracaoEmMinutos, String diretor) {
        super(nome, incluidoNoPlano, anoDeLancamento, duracaoEmMinutos);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme [diretor=" + diretor + "]";
    }

    @Override
    public int getClassificacao() {
        return (int)(getSomaDasAvaliacoes() / getTotalDeAvalicoes());
    }

    @Override
    public void avalia_novo(double nota) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'avalia_novo'");
    }
    
    
}


