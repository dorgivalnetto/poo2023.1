package br.edu.ufca.poo.lista02;

public class Funcionario {
    private String nome;
    //No mundo real, usamos java.math.BigDecimal para variáveis salário
    private double salario;
    //Mais a frente usaremos java.util.Date
    private String dataAdmissao;
    private Departamento departamento;
        
    private int numero;

    public Funcionario(String nome, double salario, String dataAdmissao){
        this.nome = nome;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        System.out.println("Funcionário " + nome + " criado!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void transferir(Departamento novoDepto){
        departamento.remover(numero);
        novoDepto.adicionar(this);
    }

    public void darAumento(double percentual){
        System.out.println("Funcionario "+ nome + " ganhou aumento de R$ " + salario);
        salario += percentual * salario/100;
        System.out.println(" para R$ " + salario);
    }
    

}
