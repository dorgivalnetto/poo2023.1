public class Aluno implements Comparable<Aluno>{
    private String nome;
    private String curso;
    private double nota;
    
    public Aluno(String nome, String curso, double nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
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

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", curso=" + curso + ", nota=" + nota + "]";
    }


    /*
     * compareTo() deve retornar um inteiro negativo, zero, ou um inteiro positivo caso o objeto que
     * execute o método seja menor, igual ou maior que o objeto passado como parâmetro. Nós
     * podemos definir como a comparação deve ser realizada
     */
    @Override
    public int compareTo(Aluno o) {
       return(this.nome.compareTo(o.getNome())); 
    
    }

    public boolean equals(Object o){
        Aluno a = (Aluno) o;
        return this.nome.equals(a.getNome());
    }

    public int hashCode(){
        return this.nome.hashCode();
    }
    
}
