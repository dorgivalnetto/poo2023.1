import java.util.Scanner;

public class Questao3_testa {

    public static void main(String[] args) {
        
        Questao3 dic = new Questao3();

        int opcao = 0;

        try (Scanner scanner = new Scanner(System.in)){
            while(opcao != 4){
                System.out.println("\n1 - Adicionar termo;\n2 - Procurar termo;\n3 - Listar termos;\n4 - Sair\nOpção? ");
                opcao = Integer.parseInt(scanner.nextLine());

                String termo, significado;

                switch(opcao){
                    case 1:
                        System.out.println("Digite o termo: ");
                        termo = scanner.nextLine();
                        System.out.println("Digite o significado do termo: ");
                        significado = scanner.nextLine();

                        dic.adicionar(termo, significado);
                        break;
                    
                    case 2:
                        System.out.println("Digite o termo a ser buscado: ");
                        termo = scanner.nextLine();
                        significado = dic.consultar(termo);
                        System.out.println(significado == null ? "Termo não encontrado!" :  termo + " = " + significado);
                        break;
                    
                    case 3:
                        dic.listar();
                        break;
                }       
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}
