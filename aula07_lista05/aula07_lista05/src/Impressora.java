/*
 * Precisamos programar um checkout (fechamento de compra), que aceita
pagamentos por cartão de crédito de uma operadora qualquer e imprime os
dados da compra em uma impressora qualquer.
 */
public interface Impressora {
    void imprimir(Imprimivel imprimivel);
}
