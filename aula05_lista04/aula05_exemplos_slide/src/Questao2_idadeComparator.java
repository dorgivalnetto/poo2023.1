import java.util.Comparator;

public class Questao2_idadeComparator implements Comparator<Questao2_pessoa>{

    @Override
    public int compare(Questao2_pessoa o1, Questao2_pessoa o2) {
        return o1.getIdade().compareTo(o2.getIdade());
    }
    
}
