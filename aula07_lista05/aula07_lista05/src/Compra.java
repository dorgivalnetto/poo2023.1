/*
 * a classe Compra, que representa a compra que está sendo feita por
um cliente. Uma compra é autorizável, ou seja, pode ser cobrada por cartão de
crédito.
 */
public class Compra implements Autorizavel, Imprimivel {

    private String nomeCliente;
    private double valorTotal;
    private String produto;
    
    @Override
    public double getValorTotal() {
        return valorTotal;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public String getCabecalhoPagina() {
        return this.getNomeCliente();
    }

    @Override
    public String getCorpoPagina() {
        return this.getProduto() + " = " + this.getValorTotal();
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
    
}
