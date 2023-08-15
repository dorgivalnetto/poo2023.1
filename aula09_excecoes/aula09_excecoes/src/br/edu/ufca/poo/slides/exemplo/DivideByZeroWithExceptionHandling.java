package br.edu.ufca.poo.slides.exemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
    
    /*
     * Demonstra o lançamento de uma exceção quando ocorre uma 
     * divisão por zero
     */
    public static int quotient(int numerador, int denominador)
        throws ArithmeticException
    {
        return numerador / denominador; //possível divisão por zero
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true; //determina se mais entradas são necessárias
        do{
            try{ //lê dois números e calcula o quociente
                System.out.print("Insira um numerador inteiro");
                int numerador = scanner.nextInt();
                System.out.print("Insira um denominador inteiro");
                int denominador = scanner.nextInt();

                int resultado = quotient(numerador, denominador);
                System.out.printf("%nResultado: %d /% d = %d%n", numerador, denominador, resultado);
                continueLoop = false;
              //catch(Parâmetro de exceção = tipo de exceção que a rotina de tratamento pode processar)      
            } catch(InputMismatchException inputMismatchException){
                //Fluxo de erros padrão para gerar mensagens de erro
                System.err.printf("%nException: %s%n", inputMismatchException);
                
                //A chamada nextInt() nunca é lida com sucesso nos dados do usuário
                scanner.nextLine(); //descarta entrada para o usuário tentar de novo
                System.out.printf("Insira apenas valores inteiros. Tente novamente.%n%n");

            } catch(ArithmeticException arithmeticException){
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("Zero é um denominador inválido. Tente novamente.%n%n");
            }  
        } while(continueLoop);
        
    }
}
