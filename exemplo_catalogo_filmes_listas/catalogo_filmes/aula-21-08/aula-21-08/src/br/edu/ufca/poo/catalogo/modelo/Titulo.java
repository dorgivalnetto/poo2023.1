package br.edu.ufca.poo.catalogo.modelo;

public abstract class Titulo {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvalicoes;
    
    public Titulo(String nome, int anoDeLancamento, int duracaoEmMinutos, boolean incluidoNoPlano) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public abstract void avalia_novo(double nota);

    public void exibeFichaTecnica(){
        System.out.println("Nome do título: " + nome); 
        System.out.println("Ano de Lançamento " + anoDeLancamento); 
        System.out.println("Duração em minutos " + duracaoEmMinutos);
     }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvalicoes++;
    }

    public double mediaDasAvaliacoes(){
        return somaDasAvaliacoes/totalDeAvalicoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public int getTotalDeAvalicoes() {
        return totalDeAvalicoes;
    }

    public void setTotalDeAvalicoes(int totalDeAvalicoes) {
        this.totalDeAvalicoes = totalDeAvalicoes;
    }

    @Override
    public String toString() {
        return "Titulo [nome=" + nome + ", anoDeLancamento=" + anoDeLancamento + ", duracaoEmMinutos="
                + duracaoEmMinutos + ", incluidoNoPlano=" + incluidoNoPlano + ", somaDasAvaliacoes=" + somaDasAvaliacoes
                + ", totalDeAvalicoes=" + totalDeAvalicoes + "]";
    }
    
    
}
