package br.edu.ufca.poo.livraria.produtos;
import br.edu.ufca.poo.livraria.Autor;

public class Minilivro extends Livro {

    /*
     * A palavra super representa uma chamada de método ou
     * acesso a um atributo da superclasse. No nosso caso,
     * estamos usando o super para invocar o construtor da
     * superclasse Livro.
     */
    public Minilivro(Autor autor) {
        super(autor);
    }

    /*
     * Um Minilivro não pode ter desconto, por isso,
     * precisamos reescrever o método aplicarDesconto.
     */

    //Agora que estamos usando uma interface, o método deixou de ser da classe Livro
    
    //@Override
    //public void aplicarDesconto(double porcentagem){
    //        System.out.println("O desconto não pode ser aplicado a Minilivro");
    //}

    
    
}
