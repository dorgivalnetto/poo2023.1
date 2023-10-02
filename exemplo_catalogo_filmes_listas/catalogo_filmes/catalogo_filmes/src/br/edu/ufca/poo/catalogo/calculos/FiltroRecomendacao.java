package br.edu.ufca.poo.catalogo.calculos;

public class FiltroRecomendacao {
    
    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao()>= 4){
            System.out.println("Avaliação excelente");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Bem avaliado!");
        }else{
            System.out.println("Poucas avaliações");
        }
    }
}
