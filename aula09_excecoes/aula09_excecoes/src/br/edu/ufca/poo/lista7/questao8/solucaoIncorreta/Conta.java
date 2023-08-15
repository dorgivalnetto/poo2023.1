package br.edu.ufca.poo.lista7.questao8.solucaoIncorreta;

public class Conta {
 
    private Integer numero;
    private String titutalr;
    private Double saldo;
    private Double limiteSaque;

    public Conta(){
    }

    public Conta(Integer numero, String titutalr, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.titutalr = titutalr;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitutalr() {
        return titutalr;
    }

    public void setTitutalr(String titutalr) {
        this.titutalr = titutalr;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

}