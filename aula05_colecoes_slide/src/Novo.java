import java.util.*;
import java.util.concurrent.TimeUnit;

public class Novo {
    public static void main(String[] args) {
        List<Integer> impares = new ArrayList<Integer>();
        impares.add(1);
        impares.add(3);
        impares.add(5);

        List pares = new LinkedList();
        pares.add(2);
        pares.add(4);
        pares.add(6);

        long startTime = System.nanoTime();

        for (int i = 0; i < impares.size(); i++){
            System.out.println(impares.get(i));
        }

         /* … O código que está sendo medido termina … */
         long endTime = System.nanoTime();
 
        // obtém a diferença entre os dois valores de tempo nano
        long timeElapsed = endTime - startTime;
 
        System.out.println("Execution time in nanoseconds: " + timeElapsed);

        //long startTime = System.nanoTime();
        for (int i = 0; i < pares.size(); i++){
            System.out.println(pares.get(i));
        }
        //long endTime = System.nanoTime();
 
        // obtém a diferença entre os dois valores de tempo nano
        //long timeElapsed = endTime - startTime;
 
        //System.out.println("Execution time in nanoseconds: " + timeElapsed);
    Set<Integer> numeros = new HashSet<Integer>();
        numeros.add(2);
        numeros.add(1);
        numeros.add(3);

    System.out.println("Set: "+numeros);

    Set<Integer> outros = new TreeSet<Integer>();
        outros.add(3);
        outros.add(2);
        outros.add(1);

    System.out.println("TreeSet: "+outros);

    Set<String> conjunto = new HashSet<String>();
        conjunto.add("Copo");
        conjunto.add("Talher");
        conjunto.add("Prato");

    Iterator<String> i = conjunto.iterator();
    
    while(i.hasNext()) {
        String palavra = i.next();
        System.out.println(palavra);
    }

    Iterator<Integer> x;
    /*
     * Obtém um iterador da coleção numeros usando o método iterator().
     * O iterador x agora está associado à coleção numeros.
     * x.hasNext() verifica se ainda existem elementos na coleção para iterar.
     */
    for(x=numeros.iterator();x.hasNext();)
        System.out.println(x.next());

    for(x=outros.iterator();x.hasNext();)
        System.out.println(x.next());
}}
