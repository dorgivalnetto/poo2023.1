public class App {
    public static void main(String[] args) throws Exception {
        Autor autor1 = new Autor();
        autor1.setNome("Dorgival");
        autor1.setEmail("dorgival.netto@ufca.edu.br");
        autor1.setCpf("123.456.789-00");

        autor1.imprimirInformacoes();

        Livro livro1 = new LivroFisico(autor1);
        livro1.setTitulo("Java 8");
        livro1.setDescricao("Novos recursos da linguagen");
        livro1.setValor(59.90);
        livro1.setIsbn("978-85-66250-46-6");

        livro1.imprimirInformacoes();
        livro1.aplicarDesconto(0.40);
        livro1.aplicarDesconto(0.15);

        Ebook ebook = new Ebook(autor1);
        ebook.setValor(30.0);

        ebook.aplicarDesconto(0.3);

        ebook.aplicarDesconto(0.05);

        Autor autor2 = new Autor();
        autor2.setNome("Rodrigo Turini");

        Livro livro3 = new Minilivro(autor2);
        livro3.setValor(39.90);

        livro3.aplicarDesconto(0.3);
        
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
        carrinho1.adicionarNoCarrinho(livro1);
        carrinho1.adicionarNoCarrinho(ebook);

        System.out.println("Total " + carrinho1.getTotal());
    }
}
