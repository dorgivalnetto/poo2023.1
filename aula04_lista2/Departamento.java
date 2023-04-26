package br.edu.ufca.poo.lista02;

public class Departamento {

    private static final int MAXIMO_FUNCIONARIOS = 100;

    private String nome;

    private int idxFuncionarios = 0;

    private Funcionario [] funcionarios = new Funcionario[MAXIMO_FUNCIONARIOS];

    public Departamento(String nome){
        this.nome = nome;
        System.out.println("Departamento " + nome + " criado!");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void adicionar(Funcionario func){
        if(idxFuncionarios >= MAXIMO_FUNCIONARIOS){
            System.out.println("Não é possível adicionar um funcionário, pois o departamento está cheio");
        } else{
            //func[idxFuncionarios] = func;
            func.setDepartamento(this);
            func.setNumero(idxFuncionarios++);
            System.out.println("Funcionario "+ func.getNome() + " adicionado ao Departamento " + nome);
        }
    }

    public void darAumento(double percentual){
        for(int i = 0; i< idxFuncionarios; i++){
            funcionarios[i].darAumento(percentual);
        }
    }
}
