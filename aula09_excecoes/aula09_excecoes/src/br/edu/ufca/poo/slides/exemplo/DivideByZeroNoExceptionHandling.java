package br.edu.ufca.poo.slides.exemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {

    /*
     * Demonstra o lançamento de uma exceção quando ocorre uma
     * divisão por zero
     */
    public static int quotient(int numerador, int denominador) {
        return numerador / denominador; // possível divisão por zero
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um numerador inteiro");
        int numerador = scanner.nextInt();
        System.out.print("Insira um denominador inteiro");
        int denominador = scanner.nextInt();

        int resultado = quotient(numerador, denominador);
        System.out.printf("%nResultado: %d /% d = %d%n", numerador, denominador, resultado);
    }
}
