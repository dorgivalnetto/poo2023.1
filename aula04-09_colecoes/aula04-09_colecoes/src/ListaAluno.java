import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaAluno {
    public static void main(String[] args) {
        //criamos uma lista
        /*
         * Como estamos programando para interface. Usamos o tipo List
         * Se quisermos mudar a implementação para LinkedList, por exemplo, basta 
         * substituir o tipo ArrayList
         */
        List<Aluno> lista = new ArrayList<Aluno>();
        /*
         * O conceito de Generics, nos permite escrever código reusável para qualquer
         * tipo de objeto. Em coleções, definimos o tipo que a lista poderá adicionar,
         * incluindo um parâmetro na sua declaração. Caso, haja a tentativa de adicionar
         * um tipo diferente de String, o compilador mostrará um erro.
         */


        //instanciamos objetos da classe Aluno
        Aluno a = new Aluno("João da Silva", "POO", 8);
        Aluno b = new Aluno("Antonio Sousa", "Java", 9);
        Aluno c = new Aluno("Lúcia Ferreira", "ES", 9); 

        //adicionar os alunos a lista
        lista.add(a);
        lista.add(b);
        lista.add(c);

        //As implementações de Collections sobrescrevem o método toString()
        System.out.println(lista);

        /*
         * Agora vamos classificar a lista em ordem ascendente.
         * Para o ArrayList não existe um método de ordenação.
         * Por isso, vamos utilizar a classe Collections
        */ 
        Collections.sort(lista);
        System.out.println("Lista com Comparable: " + lista);

        /*
         * Se quisermos um tipo de orientação diferente da natural ou temos uma coleção de
         * objetos de uma classe de terceiros que não é comparável. 
         * Nesses casos utilizamos a interface Comparator.
         * Vamos criar a classe ComparaAluno
         */

        ComparaAluno ca = new ComparaAluno();
         /*
        Chamamos o método sobrecarregado sort(). Ele recebe como argumentos a lista a ser
        ordenada e uma instância da implementação de Comparator
        */
        Collections.sort(lista, ca);
        System.out.println("Lista com Comparator: " + lista);
    }
}
