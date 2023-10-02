package br.edu.ufca.poo.catalogo.modelo;

import br.edu.ufca.poo.catalogo.calculos.Classificavel;

public class Episodio implements Classificavel {
   private int numero;
   private String nome;
   private Serie serie;
   private int totalDeAvalicoes;


public int getNumero() {
    return numero;
}
public void setNumero(int numero) {
    this.numero = numero;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public Serie getSerie() {
    return serie;
}
public void setSerie(Serie serie) {
    this.serie = serie;
}

@Override
public int getClassificacao() {
       if(totalDeAvalicoes >= 5) {
        return 4;
       } else{
        return 2;
       }
}

public int getTotalDeAvalicoes() {
    return totalDeAvalicoes;
}

public void setTotalDeAvalicoes(int totalDeAvalicoes) {
    this.totalDeAvalicoes = totalDeAvalicoes;
}
   

}
