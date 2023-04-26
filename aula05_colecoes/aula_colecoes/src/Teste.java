import java.util.*;

/* 
 * Teste de Desempenho: Execute o programa e anote o tempo. 
 * Substitua ArrayList por LinkedList e repita o teste.
*/

public class Teste {
    public static void main(String[] args) throws Exception {
        final int MAX = 20000;
        long tInicio = System.currentTimeMillis();

        /*
         * Execute o código. Anote o tempo total
         * Substitua ArrayList por LinkedList e escolha a implementação mais eficiente
         */
        List<Integer> lista = new LinkedList<Integer>();
        for(int i=0; i < MAX; i++){
            lista.add(i);
        }

        for(int i = 0; i< MAX; i++){
            lista.contains(i);
        }

        long tFim = System.currentTimeMillis();
        System.out.println("Tempo total: " + (tFim - tInicio));

    }
}
