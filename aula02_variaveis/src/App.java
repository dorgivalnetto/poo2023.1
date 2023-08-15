public class App {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno();
        a1.setNome("Dorgival");
        a1.getNome();

        Aluno a2 = new Aluno("Nome", 12, 'M');
        System.out.println(a2.getNome());

        //Estudar sobre o toString
        a2.toString();
    }
}
