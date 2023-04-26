import java.util.HashSet;
import java.util.Set;

public class SetAluno {
    public static void main(String[] args) {
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva", "POO", 8);
        Aluno b = new Aluno("Antonio Sousa", "Java", 9);
        Aluno c = new Aluno("Lúcia Ferreira", "ES", 9); 
        Aluno d = new Aluno("Lúcia Ferreira", "ES", 9); 


        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);

        System.out.println(conjunto);
    }
}
