import java.util.ArrayList;
import java.util.*;

public class ListaAlunoNova {
    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("João da Silva", "POO", 8);
        Aluno b = new Aluno("Antonio Sousa", "Java", 9);
        Aluno c = new Aluno("Lúcia Ferreira", "ES", 9); 
        
        lista.add(a);
        lista.add(b);
        lista.add(c);

        System.out.println(lista);

        /*
        Execute o código. Por que não compila?
        O método sort() aceita apenas listas cujos elementos sejam de tipos que implementam
        a interface Comparable. Aluno não implementa Comparable. Vamos corrigir!
        */
        //Collections.sort(lista);
        System.out.println(lista);
    }
    
}
