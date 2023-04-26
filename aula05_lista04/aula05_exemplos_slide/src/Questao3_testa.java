import java.util.Scanner;

public class Questao3_testa {
    
    public static void main(String[] args) {
        
        Questao3_dic dic = new Questao3_dic();

        int opcao = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            while(opcao != 4){
                System.out.println("\n1 - Adicionar termo;\n2 - Procurar termo;\n3 - Listar termos;\n4 - Sair\nOpção? ");
                opcao = Integer.parseInt(scanner.nextLine());

                String termo, significado;
                switch (opcao) {
                    case 1:
                        System.out.print("Termo: ");
                        termo = scanner.nextLine();
                        System.out.print("Significado: ");
                        significado = scanner.nextLine();
                        dic.adicionar(termo, significado);
                        break;
                    
                    case 2:
                        System.out.print("Procurar termo: ");
                        termo = scanner.nextLine();
                        significado = dic.consultar(termo);
                        System.out.println(significado == null ? "Termo não encontrado." : termo + " = " + significado);
                        break;
                    
                    case 3:
                    dic.listar();
                        break;
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
