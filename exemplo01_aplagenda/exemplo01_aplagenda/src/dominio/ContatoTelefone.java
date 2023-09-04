package dominio;

public abstract class ContatoTelefone implements Contato{

    protected String nome;
    protected String telefone;

    public ContatoTelefone(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getContato() {
        return telefone;
    }

    @Override
    public String getTipo() {
        return "Tipo do Contato";
    }
    
}
