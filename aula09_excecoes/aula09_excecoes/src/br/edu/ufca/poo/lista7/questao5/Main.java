package br.edu.ufca.poo.lista7.questao5;

public class Main {
    public static void main(String[] args) {
        BancoDeDados bancoDeDados = new BancoDeDados();

        // Criação de objetos Aluno
        Aluno aluno1 = new Aluno("João", 20, 1234);
        Aluno aluno2 = new Aluno("Maria", 17, 5678);

        try {
            bancoDeDados.cadastrarAluno(aluno1);
            bancoDeDados.cadastrarAluno(aluno2);
        } catch (MatriculaDuplicadaException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
