package br.edu.ufca.poo.lista2.questao10;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FabricaLampada fabrica = new FabricaLampada();

        // Pergunta que lâmpada quer construir.
        System.out.println("Que tipo de lâmpada deseja criar: [I]ncandescente; [F]luorescente?");
        char escolha = scanner.next().toLowerCase().charAt(0);

        // Verifica qual foi a forma escolhida.
        Lampada l = null;
        switch (escolha) {
            case 'i':
                l = fabrica.construir(false);
                break;

            case 'f':
                l = fabrica.construir(true);
                break;

            default:
                System.out.println("Opção inválida.");
        }

        // Liga e desliga a lâmpada.
        if (l != null) {
            l.ligar();
            l.desligar();
        }

        scanner.close();
    }
}
