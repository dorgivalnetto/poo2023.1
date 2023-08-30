package br.edu.ufca.poo.catalogo.modelo;

import br.edu.ufca.poo.catalogo.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel{
    private String diretor;

    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos, boolean incluidoNoPlano, String diretor) {
        super(nome, anoDeLancamento, duracaoEmMinutos, incluidoNoPlano);
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
        return super.toString() + " Filme [diretor=" + diretor + "]";
    }

    @Override
    public double getClassificacao() {
        return getSomaDasAvaliacoes()/getTotalDeAvalicoes();
    }

    @Override
    public void avalia_novo(double nota) {
        
    }

    /*
     * Titulo [nome=Gran Turismo - De Jogador a Corredor, anoDeLancamento=2023, 
     * duracaoEmMinutos=135, incluidoNoPlano=true, somaDasAvaliacoes=24.0, 
     * totalDeAvalicoes=3] Filme [diretor=Fulano de tal]
     */
}
