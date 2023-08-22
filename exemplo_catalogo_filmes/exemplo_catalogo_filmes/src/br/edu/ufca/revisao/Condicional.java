package br.edu.ufca.revisao;
public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2023;
        boolean incluidoNoPlano = false; 
        String tipoDoPlano = "Normal";

        if(anoDeLancamento >= 2023){
            System.out.println("Lançamento!");
        }else{
            System.out.println("Filmes \"antigos\" ");
        }

        if(incluidoNoPlano || tipoDoPlano.equals("Plus")){
            System.out.println("Filme liberado!");
        } else{
            System.out.println("Necessário alugar!");
        }
    }
}
