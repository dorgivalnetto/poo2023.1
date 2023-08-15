package br.edu.ufca.poo.lista7.questao3;

public class Main {

    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.deposita(1000.0); 

        double valorSaque = 800.0;

        /*
         * No código da classe principal, o método saca é chamado dentro de um bloco
         * try-catch, onde a exceção ContaExcecao é capturada e tratada. Caso a exceção
         * seja lançada, a mensagem de erro é exibida. Caso contrário, é exibida a 
         * mensagem de "Saque realizado com sucesso". Dessa forma, o código da classe Main
         * trata a exceção ContaExcecao lançada pelo método saca da classe Conta.
         */
        try {
            minhaConta.saca(valorSaque);
            System.out.println("Saque realizado com sucesso.");
        } catch (ContaExcecao e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }
    }
}
