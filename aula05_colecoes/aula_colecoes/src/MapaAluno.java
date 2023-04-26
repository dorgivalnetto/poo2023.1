import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/*
 * Queremos recuperar os dados de um aluno passando apenas o nome como argumento
 * Map não estende Collection.
 * A chave será o nome e o valor o objeto aluno
 */
public class MapaAluno {
    /*
     * No Map as chaves não podem ser duplicadas, por isso as classes devem sobrescrever
     * hashCode() e equals().
     */

    public static void main(String[] args) {
        //TreeMap garante que as chaves estão em ordem Ascendente
        Map<String, Aluno> mapa = new TreeMap<String, Aluno>();

        Aluno a = new Aluno("João da Silva", "POO", 8);
        Aluno b = new Aluno("Antonio Sousa", "Java", 9);
        Aluno c = new Aluno("Lúcia Ferreira", "ES", 9); 
        Aluno d = new Aluno("Benedito Silva", "Java", 7); 

        //inserir put()
        mapa.put("João da Silva", a);
        mapa.put("Antonio Sousa", b);
        mapa.put("Lúcia Ferreira", c);
        mapa.put("Benedito Silva", d);

        System.out.println(mapa);

        //recuperar get()
        System.out.println(mapa.get("Lúcia Ferreira"));

        /*Para percorrer o Map e recuperar os valores associados às chaves
         utilizaremos o método values()
        */
        Collection<Aluno> alunos = mapa.values();
        for(Aluno e : alunos){
            System.out.println(e);
        }
    }
    
}
