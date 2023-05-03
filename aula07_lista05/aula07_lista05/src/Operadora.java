/*
 * a interface Operadora, que define o que uma operadora de
cartão de crédito deve ter.
 */
public interface Operadora {
    boolean autorizar(Autorizavel autorizavel, Cartao cartao);
}
