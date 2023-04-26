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

     @Override
    public void aplicarDesconto(double porcentagem){
            System.out.println("O desconto não pode ser aplicado a Minilivro");
    }

    
    
}
