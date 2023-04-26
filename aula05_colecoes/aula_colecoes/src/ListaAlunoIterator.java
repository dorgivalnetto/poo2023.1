import java.util.ArrayList;
import java.util.*;

public class ListaAlunoIterator {
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
        As interfaces que estendem Collection herdam o método iterator(). Usamos
        os métodos de Iterator para percorrer um collection do início ao fim e até
        remover seus elementos.
        */
        Aluno aluno;
        //É necessário informar o tipo que será retornado pelo Iterator.
        Iterator<Aluno> itr = lista.iterator();
        //hasNext() retorna true se houver elemento a ser lido
        while(itr.hasNext()){
            //next() retorna o objeto, de acordo com o tipo informado na declaração da interface
            aluno = itr.next();
            System.out.println(aluno.getNome());
        }
    }
    
}
