/*
 * Considerando que, além do nome do aluno, precisamos de outras informações. Vamos criar
 * uma classe e modificamos a classe ListaAlunoNova
 */
public class Aluno implements Comparable<Aluno>{

    /*
     * A interface Comparable tem apenas um método a ser implementado compareTo()
     */

    private String nome;
    private String curso;
    private double nota;

    public Aluno (String nome, String curso, double nota){
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    public String toString(){
        return this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    /*
     * compareTo() deve retornar um inteiro negativo, zero, ou um inteiro positivo caso o objeto que
     * execute o método seja menor, igual ou maior que o objeto passado como parâmetro. Nós
     * podemos definir como a comparação deve ser realizada
     */
    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
        /*
         * Se quisermos um tipo de orientação diferente da natural ou temos uma coleção de
         * objetos de uma classe de terceiros que não é comparável. Nesses casos utilizamos
         * a interface Comparator. Vamos criar a classe ComparaAluno
         */
    }

    /*
     * HashSet faz uma chamada ao método equals() para verificar se os dois objetos são iguais.
     * Dois alunos são iguais quando têm nomes iguais, por isso o método equals() retorna
     * a comparação entre os nomes de dois alunos.
     */
    public boolean equals(Object o){
        Aluno a = (Aluno) o;
        return this.nome.equals(a.getNome());
    }

    //Por exemplo, um aluno terá um código hash igual ao hash do seu nome.
    public int hashCode(){
        return this.nome.hashCode();
    }

    
    
}
