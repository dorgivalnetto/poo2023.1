public abstract class Livro implements Produto{
    /*
     * Um Livro é apenas uma abstração de tudo que
     * os diferentes tipos de livros devem ter (herdar)
     * em nossa Livraria.
     * 
     * Há uma forma de impedir que a classe Livro seja 
     * instanciada. Assim, não vamos permitir a venda de 
     * um Livro, mas sim de suas subclasses.
     * 
     * Todo livro criado agora precisa ter seu tipo
     * bem definido.
     * 
     * Quando uma classe deve ser abstrata?
     * Quando ela pode definir tudo que as subclasse têm
     * em comum, mas cada tipo tem suas particularidades e
     * deve ser representado de uma forma própria.
     */
    private String titulo;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    
    public Livro(Autor autor){
        this.autor = autor;
        this.isbn = "000-00-00000-00-0"; 
    }

    

    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getDescricao() {
        return descricao;
    }



    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    public double getValor() {
        return valor;
    }



    public void setValor(double valor) {
        this.valor = valor;
    }



    public String getIsbn() {
        return isbn;
    }



    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    public Autor getAutor() {
        return autor;
    }



    public void setAutor(Autor autor) {
        this.autor = autor;
    }



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

    /*
     * Como cada tipo de Livro terá uma estratégia diferente de desconto
     * Toda classe abstrata pode ter métodos abstratos.
     * Assim, toda subclasse concreta é obrigada a escrever os
     * métodos abstratos da superclasse.
     */
    //public void aplicarDesconto(double porcentagem){
    //    System.out.println("Aplicando desconto...");
    //}

    //public abstract void aplicarDesconto(double porcentagem);
        

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