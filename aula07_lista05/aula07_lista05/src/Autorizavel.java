/*
 * Autorizavel é uma interface, que define o que uma classe deve implementar para
ser autorizável, ou seja, para ser processada por alguma operadora de cartão de
crédito.
 */
public interface Autorizavel {
    double getValorTotal();
}
