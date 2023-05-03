/*
 * Imagine que sua empresa tenha necessidade de instalar uma nova impressora,
e também fechou um contrato com a Redecard, para ter uma alternativa no
processamento de pagamentos com cartões de crédito.

A classe Redecard autoriza apenas cartões que os números iniciem com 456 e o
valor total seja menor que R$200.
 */
public class Redecard implements Operadora{

    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("456") && autorizavel.getValorTotal() < 200;
    }   
}
