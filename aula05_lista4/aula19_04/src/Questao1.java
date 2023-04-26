import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Questao1 {
    
    public static void main(String[] args) {
        
        Integer[] numeros = {2, 5, 3, 9, 2, 4, 3, 8, 5};

        List<Integer> lista = new ArrayList<Integer>();
        Set<Integer> conjunto = new HashSet<Integer>();

        for(int i = 0; i < numeros.length; i++){
            lista.add(numeros[i]);
            conjunto.add(numeros[i]);
        }

        System.out.print("Lista: ");
        for(Integer num : lista){
            System.out.print(num + " , ");
        }
        
        System.out.println("");
        
        System.out.print("Conjunto: ");
        for(Integer num : conjunto){
            System.out.print(num + " , ");
        }
    }
}
