package br.edu.ufca.poo.lista7.questao3;

public class Conta {
    private double saldo;

    /*
     * Dentro do método saca da classe Conta, é verificado se o valor a ser sacado
     * é maior do que o saldo disponível. Se for, uma nova instância de ContaExcecao
     * é lançada com uma mensagem apropriada.
     */
    public void saca(double valor) throws ContaExcecao {
        if (valor > saldo) {
            throw new ContaExcecao("Saldo insuficiente para sacar o valor desejado.");
        }
        saldo -= valor;
    }


    public void deposita(double valor){
        saldo += valor;
    }
    // Restante da implementação da classe Conta
}
