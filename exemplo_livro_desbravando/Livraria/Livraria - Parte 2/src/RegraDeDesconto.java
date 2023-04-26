public class RegraDeDesconto {
    
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Dorgival Netto");

        Livro livro = new LivroFisico(autor);
        livro.setValor(59.90);

        livro.aplicarDesconto(0.4);

        livro.aplicarDesconto(0.25);

        Ebook ebook = new Ebook(autor);
        ebook.setValor(30.0);

        ebook.aplicarDesconto(0.3);

        ebook.aplicarDesconto(0.05);

        Autor autor2 = new Autor();
        autor2.setNome("Rodrigo Turini");
        Livro livro3 = new Minilivro(autor2);
        livro.setValor(39.90);

        livro3.aplicarDesconto(0.3);

    }
}
