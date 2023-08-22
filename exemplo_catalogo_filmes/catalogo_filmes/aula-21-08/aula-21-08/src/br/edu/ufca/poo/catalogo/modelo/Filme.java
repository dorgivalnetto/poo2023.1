package br.edu.ufca.poo.catalogo.modelo;
public class Filme {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;

    public Filme(){}

    
    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos, boolean incluidoNoPlano) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + this.nome);;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }


    public String getNome() {
        return nome;
    }


    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }


    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }


    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void avalia(double nota){
    }

    public double mediaDasAvaliacoes(){
    }

}
