import java.util.*;

public class AlunoLista {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * Como estamos programando para interface. Usamos o tipo List
         * Se quisermos mudar a implementação para LinkedList, por exemplo, basta 
         * substituir o tipo ArrayList
         */
        List<String> lista = new ArrayList<String>();

        /*
         * O conceito de Generics, nos permite escrever código reusável para qualquer
         * tipo de objeto. Em coleções, definimos o tipo que a lista poderá adicionar,
         * incluindo um parâmetro na sua declaração. Caso, haja a tentativa de adicionar
         * um tipo diferente de String, o compilador mostrará um erro.
         */

        lista.add("João da Silva");
        lista.add("Antônio Sousa");
        lista.add("Lúcia Ferreira");

        //As implementações de Collections sobrescrevem o método toString()
        System.out.println(lista);

        /*
         * Agora vamos classificar a lista em ordem ascendente. Para o ArrayList não existe
         * um método de ordenação. Por isso, vamos utilizar a classe Collections
        */ 
        Collections.sort(lista);
        System.out.println("Lista Ordenadada: " + lista);
    }    
}
