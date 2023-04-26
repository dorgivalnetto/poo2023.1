public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor1 = new Autor();
        autor1.setNome("Maurício Aniche");

        LivroFisico fisico1 = new LivroFisico(autor1);
        fisico1.setTitulo("Test-Driven Development");
        fisico1.setValor(59.90);

        Ebook ebook1 = new Ebook(autor1);
        ebook1.setTitulo("Test-Driven Development");
        ebook1.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        /*
         * Como o parâmetro recebido no método adiciona
         * é um Livro, qual método aplicaDescont foi executado?
         * 
         * O método executado sempre será escolhido
         * em tempo de execução (runtime) e não em compilação
         */
        carrinho.adiciona(fisico1);
        carrinho.adiciona(ebook1);

        System.out.println("Total: " + carrinho.getTotal());
    }
}
