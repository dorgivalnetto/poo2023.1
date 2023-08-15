package br.edu.ufca.poo.lista7.questao8.solucaoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NovoMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta");

        System.out.println("Número: ");
        int numero = sc.nextInt();

        System.out.println("Titular: ");
        //Para capturar o "enter" dado na solicitação anterior
        sc.nextLine();
        String titular = sc.nextLine();

        System.out.println("Saldo inicial: ");
        double saldo = sc.nextDouble();

        System.out.println("Limite de saque: ");
        double limiteSaque = sc.nextDouble();

        Conta c1 = new Conta(numero, titular, saldo, limiteSaque);
        System.out.println();
        System.out.println("Informe uma quantia para sacar");
        double valor = sc.nextDouble();

        try{
            c1.sacar(valor);
            System.out.println("Novo saldo: " + c1.getSaldo());
        }catch (RegrasException | RuntimeException re){
            System.out.println(re.getMessage());
        }

        sc.close();

    }
}
