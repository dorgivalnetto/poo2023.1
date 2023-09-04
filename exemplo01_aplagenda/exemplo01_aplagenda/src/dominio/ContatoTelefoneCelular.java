package dominio;

public class ContatoTelefoneCelular extends ContatoTelefone {
	/** Construtor. */
	public ContatoTelefoneCelular(String nome, String telefone) {
		super(nome, telefone);
	}

	@Override
	public String getTipo() {
		return "Celular";
	}
}
