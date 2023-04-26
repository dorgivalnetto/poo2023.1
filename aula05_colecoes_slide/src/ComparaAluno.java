import java.util.Comparator;

public class ComparaAluno implements Comparator<Aluno>{

    @Override
    public int compare(Aluno a, Aluno b) {
        return a.getNome().compareTo(b.getNome());
    }

}