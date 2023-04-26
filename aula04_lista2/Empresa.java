package br.edu.ufca.poo.lista02;

public class Empresa {

    private static final int MAXIMO_DEPARTAMENTOS = 10;

    private String nome;
    private String cnpj;
    private Departamento[] departamentos = new Departamento[MAXIMO_DEPARTAMENTOS];
    
    private int idxDepartamentos = 0;

    public Empresa(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
        System.out.println("Empresa " + nome + " criada!");
    }

    public static int getMaximoDepartamentos() {
        return MAXIMO_DEPARTAMENTOS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void adicionar(Departamento depto)   {
        if(idxDepartamentos >= MAXIMO_DEPARTAMENTOS){
            System.out.println("Não é possível adicionar um departamento, pois a empresa está cheia");
        }else{
            departamentos[idxDepartamentos++] = depto;
            System.out.println("Departamento "+ depto.getNome() + " adicionado a Empresa");
        }
    }

   public void darAumento(double percentual){
    for(int i=0; i < idxDepartamentos; i++){
        departamentos[i].darAumento(percentual);
    }
   } 
    
}
