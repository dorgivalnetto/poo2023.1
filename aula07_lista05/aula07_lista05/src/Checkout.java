/*
 * Esta classe receberá uma Operadora e
uma Impressora no construtor, e terá um método fecharCompra, que receberá uma
Compra e um Cartao para fechar a compra (autorizar e imprimir o cupom).
 */
public class Checkout {
    private Operadora operadora;
    private Impressora impressora;

    public Checkout(Operadora operadora, Impressora impressora){
        this.operadora = operadora;
        this.impressora = impressora;
    }

    public void fecharCompra(Compra compra, Cartao cartao){
        boolean autorizado = this.operadora.autorizar(compra, cartao);

        if(autorizado){
            this.impressora.imprimir(compra);
        } else{
            System.out.println("Pagamento negado!");
        }
    }
}


