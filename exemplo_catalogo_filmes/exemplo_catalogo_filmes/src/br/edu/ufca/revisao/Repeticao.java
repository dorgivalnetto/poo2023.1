package br.edu.ufca.revisao;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Repeticao {
    public static void main(String[] args) {
        int leitura;
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            leitura = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua avaliacao para o filme?"));
            nota = leitura;
            mediaAvaliacao += nota;
        }
        
      System.out.println("Média de avaliação: " + mediaAvaliacao/3);
    }
}
