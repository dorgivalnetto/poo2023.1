public class Questao2_pessoa implements Comparable<Questao2_pessoa>{
    private String nome;
    private Integer idade;
    private Double altura;

    public Questao2_pessoa(String nome, Integer idade, Double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int compareTo(Questao2_pessoa p){
        return nome.compareTo(p.nome);
    }

    public String toString(){
        return nome  + "(" + idade + " anos, " + altura + " de altura)";
    }
}
