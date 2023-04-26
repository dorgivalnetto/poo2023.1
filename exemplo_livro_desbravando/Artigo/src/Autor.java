
public class Autor {

    private String nome;
    private String ultimoNome;
    
    public Autor(String nome, String ultimoNome) {
        this.nome = nome;
        this.ultimoNome = ultimoNome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUltimoNome() {
        return ultimoNome;
    }
    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    
}
