public class TesteCheckout {
    public static void main(String[] args) {
        // precisamos de implementações de Operadora e Impressora
        //Operadora operadora = new Cielo();
        //Impressora impressora = new ImpressoraEpson();

        Operadora operadora = new Redecard();
        Impressora impressora = new ImpressoraXingLing();

        Cartao cartao = new Cartao();
        cartao.setNomeTitular("João M Couves");
        cartao.setNumeroCartao("456");
        
        Compra compra = new Compra();
        compra.setNomeCliente("João Mendonça Couves");
        compra.setProduto("Sabonete");
        compra.setValorTotal(2.5);
        
        Checkout checkout = new Checkout(operadora, impressora);
        checkout.fecharCompra(compra, cartao);
    }
}
