package dominio;

public class ContatoEmail implements Contato{
    
    protected String nome;
    protected String email;

    public ContatoEmail(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getContato() {
        return email;
    }

    @Override
    public String getTipo() {
        return "E-mail";
    }
    
}
