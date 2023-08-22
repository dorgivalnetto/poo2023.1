import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito");    
        String nomeFilme = leitura.nextLine();
        System.out.println(nomeFilme);

        System.out.println("Digite o ano de lançamento do filme");
        int anoDeLancamento = leitura.nextInt();
        System.out.println(anoDeLancamento);

        System.out.println("Digite a avaliação do filme");
        float avaliacao = leitura.nextFloat();
        System.out.println(avaliacao);

    }
    

}
