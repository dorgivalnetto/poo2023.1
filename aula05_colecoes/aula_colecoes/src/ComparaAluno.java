import java.util.Comparator;

/*
 * Se precisarmos de uma ordenação diferente da natural ou uma coleção de objetos de uma
 * classe de terceiros que não implementa Comparable. Usamos a interface Comparator
 */
public class ComparaAluno implements Comparator<Aluno>{

    @Override
    public int compare(Aluno a, Aluno b) {
        return a.getNome().compareTo(b.getNome());
    }

    /*
     * Para usar essa implementação chamaremos o método sobrecarregado sort() da classe Collections
     * que recebe como argumentos a lista a ser ordenada e uma instância da implementação de Comparator.
     * Vamos para classe ListaAlunoComparator
     */
    
}
