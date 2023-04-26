public class Livro{
    String titulo;
    String descricao;
    double valor;
    String isbn;
    boolean impresso;
    String nomeDoAutor;
    String emailDoAutor;
    String cpfDoAutor;
    /*
     * Uma classe pode ter outra classe
     * como atributo, esse é um processo
     * natural conhecido como composição.
     */
    Autor autor;

    /*
     * No lugar de deixar essa lógica
     * de impressão dos dados do livro
     * toda espalhada, podemos isolar 
     * esse comportamento comum entre
     * os livros na classe
     */
    public void imprimirInformacoes(){
        String mensagem = "Mostrando detalhes do livro";
        System.out.println(mensagem);
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("--");

        //Como exibir as informações referentes ao autor?

        autor.imprimirInformacoes();
    }

    public void aplicarDesconto(double porcentagem){
        if (porcentagem > 0.3){
            System.out.println("O desconto não pode ser maior do que 30%");
        } else if(!this.impresso && porcentagem > 0.15){
            System.out.println("O desconto não pode ser maior do que 15%");
        }
        this.valor -= this.valor * porcentagem;
        System.out.println("Valor do livro com desconto: " + this.valor);            
            
    }

    public boolean temAutor(){
        return this.autor != null;
    }

    /*
     * Uma das grandes diferenças da OO
     * é que temos uma forma forte de criar
     * conexão entre informações e funcionalidades.
     * Além disso, nosso código fica muito
     * mais organizado e evitamos muita 
     * repetição. Um código mais flexível
     * e, com isso, mais fácil de evoluir
     * e manter.
     */


     /*
      * Todo Livro precisa ter um Autor.
        Como implementar essa funcionalidade?
      */

      /* 
      public Livro(Autor autor){
        this.autor = autor;
        this.impresso = true;
      }
      */

      /*
       * E, se quisermos que a classe Livro tenha
       * mais de um construtor? Um que obrigue
       * informarmos um Autor e outro que não.
       * 
       * Uma classe pode, sim, ter mais de um 
       * construtor, isso é conhecido como uma
       * sobrecarga (overloaded) de construtor.
       */




}