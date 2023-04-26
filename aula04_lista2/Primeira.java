package br.edu.ufca.poo.lista02;

import java.util.Scanner;

public class Primeira {
    
    public static void main(String[] args) {
        //definição do vetor
        int[] vetor = new int[10];
        

        //Lê os números do vetor
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Digite 10 números positivos");

        for(int i=0; i< vetor.length; i++){
            vetor[i] = scanner.nextInt();
            //System.out.println(vetor[i]);
        }

        int x = 0;

        //Lê o número x
        System.out.println("Digite um número inteiro x");
        x = scanner.nextInt();

        int maiorDistancia = vetor[1] - vetor[0];
        int indiceMaiorDistancia = 1;
        boolean crescente = true, decrescente= true;
        int maiorX = 0, menorX = 0, igualX = 0;
        
        //verificar a posição 0 sozinho
        if (vetor[0] > x)
			maiorX++;
		else if (vetor[0] == x)
			igualX++;
		else
			menorX++;

        for (int i = 1; i < vetor.length; i++){
            //Verifica o par com maior distância
            int distancia = vetor[i] - vetor [i - 1];
            if(distancia > maiorDistancia){
                maiorDistancia = distancia;
                indiceMaiorDistancia = i;
            }
        

            //verifica a ordem do vetor
            if(vetor[i] >= vetor[i-1]){
                decrescente = false;
            }
            if (vetor[i] <= vetor[i -1]){
                crescente = false;
            }

            //contar se é maior, menor ou igual
            if(vetor[i] > x){
                maiorX++;
            } else if(vetor[i]== x){
                igualX++;
            } else{
                menorX++;
            }
        }

        // Imprime os resultados.
		System.out.printf("A maior distância é de %d, entre os elementos vetor[%d] = %d e vetor[%d] = %d%n", maiorDistancia, indiceMaiorDistancia - 1, vetor[indiceMaiorDistancia - 1], indiceMaiorDistancia, vetor[indiceMaiorDistancia]);
		System.out.printf("A ordem do vetor é: %s%n", (crescente ? "crescente" : (decrescente ? "decrescente" : "não ordenado")));
		System.out.printf("Dado x = %d, no vetor existem %d elemento(s) maior(es) que x, %d elemento(s) menor(es) que x e %d elemento(s) igual(is) a x.%n", x, maiorX, menorX, igualX);
    }
}
