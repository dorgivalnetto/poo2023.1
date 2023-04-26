package br.edu.ufca.poo.lista02;

import java.util.Random;

public class Segunda {
    
    //Objeto da classe Random compartilhado por todas as instâncias de Aleatório
    private static Random random = new Random(System.currentTimeMillis());
    /*
     * Como o atributo é estático, sempre que um objeto for criado,
     * eles irão possuir o mesmo valor para o atributo.
     */

    //Constante
    private static final int VALOR_MAXIMO_DEFAULT = 20;

    //Número aleatório
    private int numero;

    //Construtor com o valor máximo
    public Segunda(int valorMaximo){
        numero = random.nextInt(valorMaximo);
    }

    //Construtor valor padrão
    Segunda() {
        this(VALOR_MAXIMO_DEFAULT);
    }

    public int getNumero(){
        return numero;
    }
    public static void main(String[] args){
        for(int i = 0; i< 10; i++){
            //Quando for par, usa o construtor padrão. Quando for ímpar, usa o valor máximo
            Segunda aleatorio = ((i%2==0) ? new Segunda() : new Segunda(10 * i));
            System.out.println(aleatorio.getNumero());
        }
    }

}
