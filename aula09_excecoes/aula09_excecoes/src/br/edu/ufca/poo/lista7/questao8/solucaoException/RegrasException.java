package br.edu.ufca.poo.lista7.questao8.solucaoException;

//public class RegrasException extends RuntimeException{
public class RegrasException extends Exception{

    public RegrasException(String msg){
        super(msg);
    }
    
}
