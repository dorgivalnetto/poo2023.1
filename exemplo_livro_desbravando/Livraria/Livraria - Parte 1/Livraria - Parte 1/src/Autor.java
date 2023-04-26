public class Autor {
    String nome;
    String email;
    String cpf;


    public void imprimirInformacoes(){
        String mensagem = "Mostrando detalhes do livro";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Nome: " + email);
        System.out.println("Nome: " + cpf);
    }

    /*
     * Se todos os atributos de nossas
     * classes forem private, precisaremos
     * criar um método sempre que quisermos
     * que alguém consiga adicionar um valor
     * ao atributo e o mesmo quando quisermos
     * que alguém consiga ler e exibir este valor.
     */
}
