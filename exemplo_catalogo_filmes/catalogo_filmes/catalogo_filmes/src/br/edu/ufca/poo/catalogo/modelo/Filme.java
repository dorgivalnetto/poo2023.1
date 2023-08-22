package br.edu.ufca.poo.catalogo.modelo;

public class Filme extends Titulo{
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
    
    
}


