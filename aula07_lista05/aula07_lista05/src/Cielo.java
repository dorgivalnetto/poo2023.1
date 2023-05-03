/*
 * implementação da Cielo autorizará apenas cartões com
números que comecem com 123.
 */
public class Cielo implements Operadora{

    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("123");
    }
    
}
