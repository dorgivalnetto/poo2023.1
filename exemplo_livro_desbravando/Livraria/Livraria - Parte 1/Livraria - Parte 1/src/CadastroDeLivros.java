public class CadastroDeLivros {
    public static void main(String[] args) throws Exception {
        Livro livro1 = new Livro();
        livro1.titulo = "Java 8 prático";
        livro1.descricao = "Novos recursos da linguagem";
        livro1.valor = 59.90;
        livro1.isbn = "978-85-66250-46-6";

        System.out.println(livro1.titulo);
        System.out.println(livro1.descricao);
        System.out.println(livro1.valor);
        System.out.println(livro1.isbn);

        Autor autor1 = new Autor();
        autor1.nome = "Dorgival Netto";
        autor1.email = "dorgival.netto@ufca.edu.br";
        autor1.cpf = "123.456.789-00";

        //Vamos associar esse objeto ao seu livro.
        livro1.autor = autor1;

        livro1.imprimirInformacoes();


        Autor autor2 = new Autor();
        autor2.nome = "Paul Deitel";
        autor2.email = "paul.deitel@ufca.edu.br";
        autor2.cpf = "123.456.789.10";

        if(autor1 == autor2){
            System.out.println("São os mesmos autores");
        } else{
            System.out.println("Por que são diferentes?");
        }

        /*
         * Quando comparamos utilizando o == 
         * estamos comparando o valor da 
         * variável, que sempre será a 
         * referência (endereço) para onde
         * encontrar o objeto na memória.
         */


         /*
          * Depois de instanciado, um objeto
          do tipo Livro pode precisar ter seu
          valor ajustado. É comum aplicar um 
          desconto no preço de um livro, por 
          exemplo. Vamos escrever um método
          para aplicar 10% de desconto
          no valor de um livro. E o desconto 
          máximo é de 30%.
          */

          livro1.valor = 59.90;

          System.out.println("Valor atual: " + livro1.valor);

          livro1.aplicarDesconto(0.1);

          livro1.aplicarDesconto(0.4);

          //Nada obriga o desenvolvedor a utilizar o método aplicarDesconto
          livro1.valor -= livro1.valor * 0.4;
          System.out.println("Tentativa de aplicar um desconto maior: " + livro1.valor);

          //Por que isso acontece?


          /*
           * Encapsulamento. A ideia é
           * simplesmente esconder todos 
           * os atributos de suas classes 
           * (deixando-os private) e encapsular
           * seus comportamentos em métodos. 
           * Além disso, encapsular é esconder 
           * como funcionam suas regras de negócio,
           * os seus métodos.
           */


           /*
            *Sempre que criamos um Livro, já atribuímos
             seu número de ISBN, mas normalmente esse
             identificador pode demorar alguns dias para
             ficar pronto.

             Outro uso bem comum de um construtor é para
             inicialização de atributos, como o caso do ISBN. 
             Para fornecer um valor padrão para este atributo,
             poderíamos simplesmente inicializá-lo no 
             construtor da classe.
            */
        
    }
}
