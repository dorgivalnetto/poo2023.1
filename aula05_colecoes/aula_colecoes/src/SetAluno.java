import java.util.*;

/*
 * List permite elementos duplicados. Set não permite.
 */

public class SetAluno {
    public static void main(String[] args) {
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva", "POO", 8);
        Aluno b = new Aluno("Antonio Sousa", "Java", 9);
        Aluno c = new Aluno("Lúcia Ferreira", "ES", 9); 

        /*Forçamos a inserção de um objeto duplicado, mas quando executamos
         o código, o objeto foi inserido. Por quê? */
        Aluno d = new Aluno("Antonio Sousa", "Java", 9);
        
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);

        //Como HashSet determina que dois objetos estão duplicados?
        System.out.println(conjunto);

        /*
         * HashSet usa o código hash do objeto, dado pelo método hashCode(). Antes ele verifica
         * se não existe outro objeto no Set com o mesmo código hash. Se não há código igual,
         * então o objeto que será inserido não está duplicado.
         * 
         * Classes que são instâncias de HashSet devem implementar o método hashCode(). 
         * Vamos para a classe Aluno
         */
    }
    
}
