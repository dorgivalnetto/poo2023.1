import java.util.TreeMap;
import java.util.Map;
import java.util.Collection;

public class MapaAluno {
    public static void main(String[] args) {
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

        System.out.println(mapa.get("Antonio Sousa"));

        //percorrer o map e recuperar os valores values()
        Collection<Aluno> alunos = mapa.values();
        for(Aluno e : alunos){
            System.out.println(e);
        }

    }

}
