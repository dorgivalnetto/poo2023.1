package br.edu.ufca.poo.lista7.questao3;
/*
 * Estende a classe Exception e recebe uma mensagem que 
 * descreve o "motivo" da exceção.
 */
public class ContaExcecao extends Exception {
    
    public ContaExcecao(String mensagem) {
        super(mensagem);
    }
}
