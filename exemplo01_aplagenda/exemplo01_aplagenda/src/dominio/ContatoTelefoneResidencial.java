package dominio;

public class ContatoTelefoneResidencial extends ContatoTelefone{

    public ContatoTelefoneResidencial(String nome, String telefone) {
        super(nome, telefone);
    }

    @Override
    public String getTipo() {
        return "Residencial";
    }

    
}
