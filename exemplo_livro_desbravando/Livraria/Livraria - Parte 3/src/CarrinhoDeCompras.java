

public class CarrinhoDeCompras {
    
    private double total;
    /*
        O código funcionará como esperado,
        pois podemos nos referenciar a esses
        objetos de uma forma mais genérica, 
        pela sua classe pai. Chamamos de
        polimorfismo.
     */  
    public void adiciona(Livro livro){
        /*
         * Isso quer dizer que eu posso adicionar
         * um Ebook aqui?
         * 
         * Como estamos referenciando o parâmetro 
         * passado para o método adiciona, da classe
         * CarrinhoDeCompras como um Livro, apenas os
         * métodos presentes na classe Livro poderão ser
         * invocados sem que um erro de compilação ocorra.
         */
        //Ebook ebook  = (Ebook)livro;
        //ebook.getMarcaDagua();
        System.out.println("Adicionando: " + livro);
        livro.aplicarDesconto(0.05);
        total += livro.getValor();

    }

    public void adiciona(Revista revista){
        System.out.println("Adicionando: " + revista);
        revista.aplicaDesconto(0.05);
        total += revista.getValor();
    }

    public void adiciona(Produto produto){
        System.out.println("Adicionando: " + produto);
        produto.aplicaDesconto(0.05);
        total += produto.getValor();
    }

    public double getTotal(){
        return total;
    }

}
