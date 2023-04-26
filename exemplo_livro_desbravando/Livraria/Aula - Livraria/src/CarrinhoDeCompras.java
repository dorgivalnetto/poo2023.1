public class CarrinhoDeCompras {

    private double total;

    //polimorfismo
    public void adicionarNoCarrinho(Livro livro){

        System.out.println("Adicionando livro..." + livro);
        livro.aplicarDesconto(0.05);
        total += livro.getValor();
    }

    public double getTotal(){
        return total;
    }

}
