package br.edu.ufca.revisao;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println(filme);

        System.out.println("Digite o ano de lançamento do filme ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println(anoDeLancamento);

        System.out.println("Digite a sua avaliação para o filme");
        float avaliacao = leitura.nextFloat();
        System.out.println(avaliacao);
    }
}
