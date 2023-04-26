import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Questao2_testa {
    
    public static void main(String[] args) {
        List<Questao2_pessoa> lista = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(new File("pessoas.txt"))){
            //Utiliza espaços, tabs e enter como separadores
            scanner.useDelimiter("\\n|\\s");

            //Lê as pessoas e coloca em uma lista
            while(scanner.hasNext()){
                Questao2_pessoa p = new Questao2_pessoa(scanner.next(), scanner.nextInt(), scanner.nextDouble());
                lista.add(p);
            }
        }

        Collections.sort(lista);
        System.out.println("Ordem padrão");
        for(Questao2_pessoa p : lista){
            System.out.println(p);
        }

        Collections.sort(lista, new Questao3_idadeComparator());
        System.out.println("Ordenado por idade");
        for(Questao2_pessoa p : lista){
            System.out.println(p);
        }

    }
}
