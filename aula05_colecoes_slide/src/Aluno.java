public class Aluno implements Comparable<Aluno>{
    private String nome;
    private String disciplina;
    private double nota;
    
    public Aluno(String nome, String disciplina, double nota) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


    //não compara notas (double)
    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    } 

    public boolean equals(Object o){
        Aluno a = (Aluno) o;
        return this.nome.equals(a.getNome());

    }

    public int hashCode(){
        return this.nome.hashCode();
    }
}
