import java.util.ArrayList;
import java.util.*;

public class ListaAlunoComparator {
    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<Aluno>();
        ComparaAluno ca = new ComparaAluno();

        Aluno a = new Aluno("João da Silva", "POO", 8);
        Aluno b = new Aluno("Antonio Sousa", "Java", 9);
        Aluno c = new Aluno("Lúcia Ferreira", "ES", 9); 
        
        lista.add(a);
        lista.add(b);
        lista.add(c);

        System.out.println(lista);

        /*
        Chamamos o método sobrecarregado sort(). Ele recebe como argumentos a lista a ser
        ordenada e uma instância da implementação de Comparator
        */
        Collections.sort(lista, ca);
        System.out.println(lista);
    }
    
}
