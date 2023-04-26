import java.util.Map;
import java.util.TreeMap;

/*
 * Aula 05 - Slide 22
 * Escreva uma aplicação de dicionário com três 
 * funções: adicionar um termo ao dicionário, 
 * procurar um termo no dicionário e listar todos
 *  os termos existentes em ordem alfabética.
 */
public class Questao3 {
    
    private Map<String, String> termos = new TreeMap<>();

    public void adicionar(String termo, String significado){
        termos.put(termo, significado);
    }

    public String consultar(String termo){
        return termos.get(termo);
    }

    public void listar(){
        //Map.Entry<String, String> entrySet() - Retorna a visualização Set de todo o mapa.
        for(Map.Entry<String, String> entrada : termos.entrySet()){
            System.out.println(entrada.getKey() + " = " + entrada.getValue());
        }
    }
    
}
